
package com.example.azkar

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

object NotificationHelper {

    private const val CHANNEL_ID = "azkar_channel"

    fun createChannel(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Azkar",
                NotificationManager.IMPORTANCE_HIGH
            )

            val manager = context.getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }
    }
}
