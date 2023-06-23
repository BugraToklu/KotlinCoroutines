package com.example.coroutines101

import kotlinx.coroutines.delay
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
val TAG = "GlobalScope"

fun globalScope(){
    GlobalScope.launch {
        delay(3000L)
        Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")
    }
    Log.d(TAG,"hello from thread ${Thread.currentThread().name}")

}
