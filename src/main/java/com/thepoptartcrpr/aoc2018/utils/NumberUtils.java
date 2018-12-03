package com.thepoptartcrpr.aoc2018.utils;

import java.util.Arrays;

public class NumberUtils {

    public static int parseIntFromString(String string) {
        char[] chars = string.toCharArray();
        String num = StringUtils.getStringFromCharArray(Arrays.copyOfRange(chars, 1, chars.length));
        int number = Integer.parseInt(num);

        // handle negatives
        if (string.charAt(0) == '-') number *= -1;

        return number;
    }

}
