package com.example.coroutines101

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    val TAG = "RunBlocking"


    Log.d(TAG,"before runBlocking")
    runBlocking {
        launch(Dispatchers.IO) {
            delay(3000L)
            Log.d(TAG,"finished IO coroutine 1")
        }
        launch(Dispatchers.IO) {
            delay(3000L)
            Log.d(TAG,"finished IO coroutine 2")
        }
        Log.d(TAG,"start runBlocking")
        delay(5000L)
        Log.d(TAG,"end runBlocking")
    }

    Log.d(TAG,"after runBlocking")

}
