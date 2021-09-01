package com.example.kotlintest

import androidx.lifecycle.Lifecycle

/**
 * author: wenjie
 * date: 2021-08-04 17:51
 * descption:
 */
class Test07 {


}

fun main() {
    val myLiveData = MyLiveData<String>()
    val myOwner = MyOwner()

    myLiveData.observe(myOwner) {

    }

    myLiveData.observe({}) {

    }

    myLiveData.observe(myOwner, {

    })

    myLiveData.observe(myOwner, Observer {

    })


    myLiveData.observe1 {

    }

    myLiveData.observe2 {

    }

    myLiveData.observe3(myOwner, {

    }) {

    }

    asd(myOwner) {

    }

    asd({

    }, myOwner)

}

fun asd(block1: () -> Unit, block2: () -> Unit) {

}

fun asd(lifecycleOwner: LifecycleOwner, block2: () -> Unit) {

}

fun asd(block2: () -> Unit, lifecycleOwner: LifecycleOwner) {

}