package com.example.kotlintest

import org.json.JSONObject

/**
 * author: wenjie
 * date: 2021-08-02 15:29
 * descption:
 */

fun main() {

//    Test02().test02()


}

class Test02 {

    fun test02() {
        val str: String? = null

        str?.apply {
            print("not")
        } ?: apply {
            print("yes")
            print(this)
        }
    }
}