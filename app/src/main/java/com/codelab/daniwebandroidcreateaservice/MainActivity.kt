package com.codelab.daniwebandroidcreateaservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startServiceButton = findViewById<Button>(R.id.button_startService)
        val stopServiceButton = findViewById<Button>(R.id.button_stopService)

        val serviceIntent = Intent(
            this,
            SampleService::class.java
        )

        startServiceButton.setOnClickListener{
            startService(serviceIntent)
        }

        stopServiceButton.setOnClickListener {
            stopService(serviceIntent)
        }

    }
}