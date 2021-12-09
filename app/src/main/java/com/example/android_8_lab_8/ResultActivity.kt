package com.example.android_8_lab_8

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val id = "my_channel_02"

        val name = getString(R.string.abc_action_bar_home_description)

        val description = getString(R.string.abc_action_bar_home_description)
        val importance = NotificationManager.IMPORTANCE_HIGH
        val mChannel = NotificationChannel(id, name, importance)

        mChannel.description = description
        mChannel.enableLights(true)

        mChannel.lightColor = Color.RED
        mChannel.enableVibration(true)
        mNotificationManager.createNotificationChannel(mChannel)
    }
}