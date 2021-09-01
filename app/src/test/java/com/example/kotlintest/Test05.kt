package com.example.kotlintest


/**
 * author: wenjie
 * date: 2021-08-03 15:52
 * descption:
 */

open class AA {

    companion object {
        @JvmStatic
        fun getValue() {

        }

        const val a = 1
    }
}

open class BB : AA() {

}

fun main() {
//    print(BB.getValue())
}