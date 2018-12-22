package com.thepoptartcrpr.aoc2018.days;

import java.util.ArrayList;
import java.util.Arrays;

public class Day2 extends Day {

    // Utility array for assuring character indices the lazy man's way
    private Character[] letterIndices = new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public Day2() {
        super("2");
    }

    @Override
    public String calculatePart1() {
        int matchedDoubleBoxIDs = 0, matchedTripleBoxIDs = 0;

        for (String boxID : this.input) {
            int[] letters = new int[26];
            boolean matchesTwo = false;
            boolean matchesThree = false;

            // Count letter occurrences
            for (char c : boxID.toCharArray()) {
                letters[Arrays.asList(letterIndices).indexOf(c)]++;
            }

            for (int i : letters) {
                if (i == 2) matchesTwo = true;
                if (i == 3) matchesThree = true;
            }

            System.out.println(Arrays.toString(letters));

            if (matchesTwo) matchedDoubleBoxIDs++;
            if (matchesThree) matchedTripleBoxIDs++;
        }

        return Integer.toString(matchedDoubleBoxIDs * matchedTripleBoxIDs);
    }

    @Override
    public String calculatePart2() {
        ArrayList<String> ids = new ArrayList<String>();

        for (String boxID : this.input) {

        }

        return null;
    }

}
