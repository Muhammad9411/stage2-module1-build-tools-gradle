package com.epam.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        boolean result = false;
        try {
            int isPositive = Integer.parseInt(str);
            if (str != null && !str.equals("")) {
                if (isPositive > 0) {
                    result = true;
                } else if (isPositive < 0) {
                    result = false;
                }
            }
        } catch (NumberFormatException nfe) {
            result = false;
        }
        return result;
    }
}
