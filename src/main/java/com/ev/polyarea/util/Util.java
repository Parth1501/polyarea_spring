package com.ev.polyarea.util;

public class Util {

    public static String buildKey(double lat,double lon) {
        String str= lat + String.valueOf(lon);
        return  str.replace(".","");
    }
}
