package com.tonybright.muslog;

import android.app.Application;

import com.tonybright.utils.MusLog;


public class MusApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }

    private void initialize() {
        MusLog.init("HugeHard", BuildConfig.DEBUG);
    }
}