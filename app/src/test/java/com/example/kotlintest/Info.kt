package com.example.kotlintest

data class Info(
    val pid: Int = 0,
    val name: String = "",
    val type: Int = 0,
    val imageInfos: List<String>,
    val labels: List<String> = listOf(),
    val brandUid: String = "123",
    val content: String = "asd",
    val user: User = User(),
    val users:List<User> = listOf()
) {
//    constructor() : this(-1, "", -1, listOf(), listOf(), "", "" , User(), listOf())
}