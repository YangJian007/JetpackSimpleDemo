package com.yang.coroutieflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PowerManager
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class MainActivity : AppCompatActivity() {

    private lateinit var tv1: TextView
    private lateinit var tv2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)



        lifecycleScope.launch {
            val startTime = System.currentTimeMillis()

            val sum = withContext(Dispatchers.IO) {
                val one = async { one() }
                val two = async { two() }
                one.await() + two.await()
            }

            val endTime = System.currentTimeMillis()

            tv1.text = sum.toString()
            tv2.text = "${endTime - startTime}"

        }


        lifecycleScope.launch {
            flow {
                for (i in 1..9) {
                    delay(1000)
                    emit(i)
                }
            }.filter { it % 3 == 0 }
                .flatMapConcat {
                    flow { emit(it*2) }
                }
                .collect {
                    println(it)
                }


            flowOf(listOf(1,2,3)).launchIn(lifecycleScope).start()

        }


    }

    private suspend fun one(): Int {
        delay(5000)
        return 6
    }

    private suspend fun two(): Int {
        delay(5000)
        return 6
    }


}