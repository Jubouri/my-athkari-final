
package com.example.azkar

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.widget.RemoteViews

class AzkarWidget : AppWidgetProvider() {

    override fun onUpdate(context: Context, manager: AppWidgetManager, ids: IntArray) {
        ids.forEach { update(context, manager, it) }
    }

    private fun update(context: Context, manager: AppWidgetManager, id: Int) {
        val views = RemoteViews(context.packageName, R.layout.widget_azkar)
        views.setTextViewText(R.id.text, AzkarStore.get(context))
        manager.updateAppWidget(id, views)
    }

    companion object {
        fun refresh(context: Context) {
            val manager = AppWidgetManager.getInstance(context)
            val ids = manager.getAppWidgetIds(
                ComponentName(context, AzkarWidget::class.java)
            )

            ids.forEach {
                val views = RemoteViews(context.packageName, R.layout.widget_azkar)
                views.setTextViewText(R.id.text, AzkarStore.get(context))
                manager.updateAppWidget(it, views)
            }
        }
    }
}
