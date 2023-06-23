package com.example.coroutines101

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main(){
    val TAG = "SuspendFunction"

    GlobalScope.launch {
        val networkCallAnswer = doNetworkCall()
        val networkCallAnswer2 = doNetworkCall2()
        Log.d(TAG,networkCallAnswer)
        Log.d(TAG,networkCallAnswer2)
    }
}
suspend fun doNetworkCall(): String {
    delay(3000L)
    return "this is the answer"
}
suspend fun doNetworkCall2(): String {
    delay(3000L)
    return "this is the answer"
}