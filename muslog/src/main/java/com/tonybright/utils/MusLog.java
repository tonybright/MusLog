package com.tonybright.utils;

import android.util.Log;

import java.util.Locale;

/**
 * Created by Tony on 16/3/12
 * It is best practice to use BuildConfig.DEBUG to control whether
 * the log is printable, in this situation, the log will cost
 * least performances in release version
 *
 * @author liang.tong
 * @version 1.0.0
 */
public class MusLog {

    private static final String MAIN_TAG = "Mus";

    private static boolean sIsLoggable;

    public static void setLoggable(boolean isLoggable) {
        sIsLoggable = isLoggable;
    }

    public static void vTag(String tag, String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.VERBOSE, tag, msg, args);
        }
    }

    public static void dTag(String tag, String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.DEBUG, tag, msg, args);
        }
    }

    public static void iTag(String tag, String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.INFO, tag, msg, args);
        }
    }

    public static void wTag(String tag, String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.WARN, tag, msg, args);
        }
    }

    public static void eTag(String tag, String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.ERROR, tag, msg, args);
        }
    }

    public static void v(String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.VERBOSE, getTagClassName(), msg, args);
        }
    }

    public static void d(String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.DEBUG, getTagClassName(), msg, args);
        }
    }

    public static void i(String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.INFO, getTagClassName(), msg, args);
        }
    }

    public static void w(String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.WARN, getTagClassName(), msg, args);
        }
    }

    public static void e(String msg, Object... args) {
        if (sIsLoggable) {
            log(Log.ERROR, getTagClassName(), msg, args);
        }
    }

    private static void log(int priority, String subTag, String info, Object... args) {
        String tag = String.format(Locale.US, "%s_%s", MAIN_TAG, subTag);
        String msg = String.format(Locale.US, info, args);

        switch (priority) {
            case Log.VERBOSE:
                Log.v(tag, msg);
                break;
            case Log.DEBUG:
                Log.d(tag, msg);
                break;
            case Log.INFO:
                Log.i(tag, msg);
                break;
            case Log.WARN:
                Log.w(tag, msg);
                break;
            case Log.ERROR:
                Log.e(tag, msg);
                break;
            default:
                Log.e(tag, "unsupported priority " + priority);
                break;
        }
    }

    private static String getTagClassName() {
        StackTraceElement thisMethodStack = (new Exception()).getStackTrace()[2];
        String className = thisMethodStack.getClassName();
        return className.substring(className.lastIndexOf(".") + 1);
    }
}
