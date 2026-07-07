package dev.noxxy.util;

import java.util.UUID;

public class StringUtil {
    public static String capitalizeFirst(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    
    public static String formatTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        
        if (hours > 0) {
            return hours + "h " + (minutes % 60) + "m";
        } else if (minutes > 0) {
            return minutes + "m " + (seconds % 60) + "s";
        } else {
            return seconds + "s";
        }
    }
    
    public static String formatDistance(double distance) {
        if (distance < 1000) {
            return String.format("%.1f m", distance);
        } else {
            return String.format("%.1f km", distance / 1000);
        }
    }
}
