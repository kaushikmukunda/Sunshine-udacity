package com.udacity.kmukunda.sunshine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

public class Util {
    public static String getLocationSetting(Context context) {
        Resources resources = context.getResources();
        String defLocation = resources.getString(R.string.pref_location_default);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(resources.getString(R.string.pref_location_key), defLocation);
    }

    public static String getTemperatureUnit(Context context) {
        Resources resources = context.getResources();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(resources.getString(R.string.temperature_unit_key), "C");
    }
}
