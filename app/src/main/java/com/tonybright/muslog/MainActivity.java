package com.tonybright.muslog;

import android.app.Activity;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showLogSamples();
    }

    private void showLogSamples() {
        MusLog.vTag("SubTag", "hello buddy");

        MusLog.vTag("SubTag", "hello buddy, today is %s", new Date());

        MusLog.v("hello buddy");

        MusLog.v("hello buddy, today is %s", new Date());
    }
}
