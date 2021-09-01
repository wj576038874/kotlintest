package com.example.kotlintest

import androidx.annotation.MainThread

/**
 * author: wenjie
 * date: 2021-08-13 13:59
 * descption:
 */
@MainThread
fun <T> lazyInit(initializer: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)
