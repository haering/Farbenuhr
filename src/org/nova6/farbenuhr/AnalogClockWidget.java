package org.nova6.farbenuhr;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class AnalogClockWidget extends AppWidgetProvider {

	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO Auto-generated method stub
		
		    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.activity_clock);
		    Intent configIntent = new Intent(context, ClockActivity.class);

		    PendingIntent configPendingIntent = PendingIntent.getActivity(context, 0, configIntent, 0);

		    remoteViews.setOnClickPendingIntent(R.id.analogClock1, configPendingIntent);
		    appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
		  
	}
}
