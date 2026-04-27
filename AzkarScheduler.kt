
package com.example.azkar

import android.content.Context
import androidx.work.*
import java.util.concurrent.TimeUnit

object AzkarScheduler {

    fun start(context: Context) {

        val work = PeriodicWorkRequestBuilder<AzkarWorker>(
            15, TimeUnit.MINUTES
        ).build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            "azkar_premium",
            ExistingPeriodicWorkPolicy.UPDATE,
            work
        )
    }
}
