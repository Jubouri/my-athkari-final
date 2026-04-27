
package com.example.azkar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AzkarScheduler.start(this)
        NotificationHelper.createChannel(this)
    }
}
