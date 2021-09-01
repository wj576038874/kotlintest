package com.example.kotlintest

/**
 * author: wenjie
 * date: 2021-08-03 16:41
 * descption:
 */


sealed class BooleanExt<out T>

object Otherwise : BooleanExt<Nothing>()

class TransferData<T>(val data: T) : BooleanExt<T>()

fun <T> Boolean.yes(block: () -> T): BooleanExt<T> = when {
    this -> TransferData(block())
    else -> Otherwise
}

fun <T> BooleanExt<T>.otherwise(block: () -> T): T = when (this) {
    is Otherwise -> block.invoke()
    is TransferData -> this.data
}

fun main() {
    val numberList = listOf(1, 2, 3, 5)
    val bol = numberList.filter { it % 2 == 1 }.count() == numberList.size
    val yes = bol.yes {
        "asd"
    }
    val s = yes.otherwise {
        123
    }
    println(s)
//    println((yes as TransferData).data)
}
