package com.example.coroutines101

import android.util.Log
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlin.system.measureTimeMillis

class Async {
    val TAG = "MainActivity"


    GlobalScope.launch(Dispatchers.IO) {
        val time = measureTimeMillis {
            val answer1 = async { networkCall() }
            val answer2 = async { networkCall2() }
            Log.d(TAG,"Answer1 is ${answer1.await()}")
            Log.d(TAG,"Answer1 is ${answer2.await()}")
        }
        Log.d(TAG,"Request took $time ms.")

    }
}
suspend fun networkCall():String{
    delay(3000L)
    return "answer 1"
}
suspend fun networkCall2():String{
    delay(3000L)
    return "answer 2"
}
}