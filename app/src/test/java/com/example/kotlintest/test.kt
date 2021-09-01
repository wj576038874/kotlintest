package com.example.kotlintest

/**
 * author: wenjie
 * date: 2021-07-28 12:06
 * descption:
 */

fun main() {
    val list = listOf(1,2,3)
    print(list.joinToString(separator = "," ,postfix = "]",prefix = "[",transform = {
        "${it}asd"
    }))

    val s:Int = 628202578
    print(s.javaClass)
}
