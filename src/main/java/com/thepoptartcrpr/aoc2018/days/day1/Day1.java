package com.thepoptartcrpr.aoc2018.days.day1;

import com.thepoptartcrpr.aoc2018.days.Day;
import com.thepoptartcrpr.aoc2018.utils.NumberUtils;

public class Day1 extends Day {

    public Day1() {
        super("1");
    }

    @Override
    public String calculatePart1() {
        int freq = 0;

        for (String str : this.input) {
            freq += NumberUtils.parseIntFromString(str);
        }

        return Integer.toString(freq);
    }

    @Override
    public String calculatePart2() {
        return null;
    }
}
