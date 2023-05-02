package com.epam.utils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        boolean result = false;
        try {
            if (str != null && !str.equals("")) {
                double isPositive = Double.parseDouble(str);
                if (isPositive > 0) {
                    result = true;
                }
            }
        } catch (NumberFormatException nfe) {
            result = false;
        }
        return result;
    }
}
