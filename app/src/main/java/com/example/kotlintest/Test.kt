package com.example.kotlintest

/**
 * author: wenjie
 * date: 2021-08-20 10:39
 * descption:
 */
fun main() {
    val persons = mutableListOf<Person>()
    repeat(20) {
        persons += Person(it, 1)
    }

    getPerson(persons, object : FilterInteface {
        override fun filter(p: Person): Boolean {
            return (p.age > 18)
        }
    })

    
    getPersons(persons){
        it.age > 18
    }


    val list1 = mutableListOf<String>()
    val list2 = listOf<String>()

    list1+=list2


    list1.let {

    }


    list1.let({

    })



}

//获取数据
fun getPerson(list: List<Person>, filterInteface: FilterInteface): List<Person> {

    val result = mutableListOf<Person>()

    for (p in list) {
        if (filterInteface.filter(p)) {
            result.add(p)
        }
    }

    return result
}

//
fun getPersons(list: List<Person>, block: (Person) -> Boolean): List<Person> {
    val result = mutableListOf<Person>()

    for (p in list) {
        if (block(p)) {
            result.add(p)
        }
    }
    return result
}


interface FilterInteface {

    fun filter(p: Person): Boolean

}