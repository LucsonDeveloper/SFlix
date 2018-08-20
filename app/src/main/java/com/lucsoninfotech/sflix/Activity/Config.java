package com.lucsoninfotech.sflix.Activity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Config {
    public static boolean isOnline(Context applicationContext) {

        ConnectivityManager cm = (ConnectivityManager) applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = null;
        if (cm != null) {
            netInfo = cm.getActiveNetworkInfo();
        }

        return netInfo != null && netInfo.isConnectedOrConnecting();

    }

}
