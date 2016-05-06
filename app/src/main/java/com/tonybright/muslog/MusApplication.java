package com.tonybright.muslog;

import android.app.Application;


public class MusApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }

    private void initialize() {
        MusLog.setLoggable(BuildConfig.DEBUG);
    }
}