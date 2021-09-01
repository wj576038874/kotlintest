package com.example.kotlintest

import com.google.gson.Gson
import com.squareup.moshi.*
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.google.gson.GsonBuilder


/**
 * author: wenjie
 * date: 2021-08-06 12:53
 * descption:
 */

fun main() {
    val json = """{
	"pid": 100,
	"name": "测试11",
	"type": 1,
	"shoeId": 11,
	"imageInfos": ["https://joyrun-activity-upyun.thejoyrun.com/erp_new/20210429/608a47c8c91c9.png", "https://joyrun-activity-upyun.thejoyrun.com/erp_new/20210429/608a47fade095.jpg", "https://joyrun-activity-upyun.thejoyrun.com/erp_new/20210429/608a490832218.png"],
	"price": 0.00,
	"labels": null,
	"content": "11",
	"brandUid": null,
	"users": [{}, {}],
	"user": {
		"username": "admin",
		"number": 199
	}
}"""


    val json2 = """{"username":null , "number":0}"""

    val s = 1

//    val builder = Moshi.Builder()
//        .add(KotlinJsonAdapterFactory())
//        .build()
//    val adapter = builder.adapter(User::class.java)
//    val user = adapter.fromJson(json)
//    println(user?.username + "")
    val gson =
        GsonBuilder().registerTypeHierarchyAdapter(Any::class.java, SafeDeserializer()).create()
    val info = Gson().fromJson(json, Info::class.java)
    println(info)
    println(gson.toJson(info))

    val user = Gson().fromJson(json2, User::class.java)
    println(user)
}



