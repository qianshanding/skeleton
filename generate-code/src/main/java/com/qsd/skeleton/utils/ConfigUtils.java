package com.qsd.skeleton.utils;


import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ConfigUtils {
    private static ResourceBundle rb = ResourceBundle.getBundle("config");

    public static String getConfig(String key, Object... params) {
        String str = null;
        if (rb.containsKey(key)) {
            str = rb.getString(key);
            str = MessageFormat.format(str, params);
        }
        return str;
    }
}