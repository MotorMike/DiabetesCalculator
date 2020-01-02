package com.example.diabetescalculator;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Implementation of App Widget functionality.
 */
public class Widget extends AppWidgetProvider {

    Button increaseCarbsButton;
    TextView inputCarbsView,insulinView;

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
//        views.setTextViewText(R.id.appwidget_text, widgetText);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);



        }
//        Toast.makeText(context,"Hello widget",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    public void increaseCarbs(Context context){
        Toast.makeText(context,"carbs up",Toast.LENGTH_SHORT).show();
    }

    public void decreaseCarbs(Context context){
        Toast.makeText(context,"Carbs down",Toast.LENGTH_SHORT).show();
    }
    public void setInsulinDisplay(Context context){
        Toast.makeText(context,"carbs set",Toast.LENGTH_SHORT).show();
//        Button btn = (Button) findViewById(R.id.btn);
//        btn.setText("MyText");
    }
}

