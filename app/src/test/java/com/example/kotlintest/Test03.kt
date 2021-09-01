package com.example.kotlintest

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * author: wenjie
 * date: 2021-08-03 10:34
 * descption:
 */
class Test03 {


}

//fun main() {
//    getName {
//        return@getName
//    }
//
//    val user = User(18, "asd")
//    val user2 = User(28, "123")
//
//    println(user + user2)
//    print("asd" * 3)
//}


operator fun String.times(n: Int): String {
    return repeat(n)
}

//operator fun User.plus(user: User ,a:Int): User {
//    return User(user.age + age, (user.name + name) * 3)
//}

fun add(block: () -> Unit) {

}


inline fun getName(crossinline block: () -> Unit) {

    add {
        block.invoke()
    }

    CoroutineScope(Dispatchers.IO).launch {
        block.invoke()
    }

}