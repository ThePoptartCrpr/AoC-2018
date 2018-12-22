package com.thepoptartcrpr.aoc2018.days;

import com.thepoptartcrpr.aoc2018.utils.NumberUtils;

import java.util.ArrayList;

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
        int freq = 0;
        ArrayList<Integer> reachedFreqs = new ArrayList<>();
        int repeatedFreq = 0;
        boolean found = false;

        while (!found) {
            for (String str : this.input) {
                freq += NumberUtils.parseIntFromString(str);
                if (reachedFreqs.contains(freq)) {
                    System.out.println("Found!");
                    repeatedFreq = freq;
                    found = true;
                    break;
                }
                reachedFreqs.add(freq);
            }
        }

        return Integer.toString(repeatedFreq);
    }
}
