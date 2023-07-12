package com.example.coroutines101

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout

class Jobs {
    val TAG = "MainActivity"


    val job = GlobalScope.launch(Dispatchers.Default){
        Log.d(TAG,"Starting long running calculation")
        withTimeout(3000L){
            for (i in 30..40){
                if (isActive){
                    Log.d(TAG,"Result for i = $i: ${fib(i)}")
                }
            }
        }

        Log.d(TAG,"Ending long running calculation")

    }
}
fun fib(n:Int):Long{
    return if (n == 0) 0
    else if (n == 1) 1
    else fib(n - 1) + fib(n - 2)
}
