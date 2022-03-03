package com.codelab.daniwebandroidcreateaservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class SampleService : Service() {
    override fun onBind(p0: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Toast.makeText(
            this,
            "Service Started",
            Toast.LENGTH_SHORT
        ).show()

        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(
            this,
            "Service Stopped",
            Toast.LENGTH_SHORT
        ).show()
    }

}