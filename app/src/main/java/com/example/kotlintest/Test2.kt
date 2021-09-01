package com.example.kotlintest

import org.json.JSONObject

/**
 * author: wenjie
 * date: 2021-08-24 10:06
 * descption:
 */
fun main() {
    val json = """{"goodsId":"1","iosGoodsId":"Joyrun_monthly_expend","price":"168","type":"7","iOSGoodId":"Joyrun_monthly_expend","redirectURL":"redirectURL"}"""

    val jsonObject = JSONObject(json)

    print(jsonObject.toString())
}