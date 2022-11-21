package com.alan.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView=findViewById(R.id.textView)

        object : CountDownTimer(10000,1000){
            override fun onFinish() {
                textView.text="Left: 0"
            }


            override fun onTick(milliUntilFinished: Long) {
                textView.text="Left: ${milliUntilFinished/1000}"
            }
        }.start()


    }
}