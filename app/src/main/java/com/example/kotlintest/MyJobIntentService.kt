package com.example.kotlintest

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.*

/**
 * author: wenjie
 * date: 2021-08-03 11:46
 * descption:
 */
class MyJobIntentService : Service() {

    private val mCoroutineScope = CoroutineScope(Dispatchers.IO)
    private var job: Job? = null


    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        onHandleIntent(intent)
        return super.onStartCommand(intent, flags, startId)
    }

    private fun onHandleIntent(intent: Intent?) {
        Log.e("asd", "onHandleIntent1---${Thread.currentThread().name}")
        job = mCoroutineScope.launch {
            try {
                Log.e("asd", "onHandleIntent2---${Thread.currentThread().name}")
                delay(5000)//加入这里是上传图片的耗时操作
                Log.e("asd", "onHandleIntent3---${Thread.currentThread().name}")
            } catch (exception: Exception) {

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job?.cancel()
        Log.e("asd", "onDestroy---${Thread.currentThread().name}")
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


    companion object {

        @JvmStatic
        fun startPost(context: Context) {
            val intent = Intent(context, MyJobIntentService::class.java)
            context.startService(intent)
        }

        @JvmStatic
        fun stopPost(context: Context) {
            val intent = Intent(context, MyJobIntentService::class.java)
            context.stopService(intent)
        }
    }
}