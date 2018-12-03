package com.thepoptartcrpr.aoc2018.days;

import com.thepoptartcrpr.aoc2018.utils.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class Day {

    private String day;

    public String[] input;
    private String output;

    public Day(String day) {
        this.day = day;
    }

    public abstract String calculatePart1();

    public abstract String calculatePart2();

    public void run() {
        try {
            this.loadInput();
            String output1 = this.calculatePart1();
            if (output1 != null) StringUtils.writeToFile(new File("src/main/resources/days/day" + this.day + "/solution1.txt"), output1);
            String output2 = this.calculatePart2();
            if (output2 != null) StringUtils.writeToFile(new File("src/main/resources/days/day" + this.day + "/solution2.txt"), output2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // I'm a big dumb and harvesting automatically won't work lmao
    /*private void loadInput() throws FileNotFoundException, MalformedURLException, IOException {
        File file = new File("resources/days/day" + this.day + "/input.txt");
        String input = file.exists() ? StringUtils.readFromFile(file) : StringUtils.loadFromUrl(new URL("https://adventofcode.com/2018/day/" + this.day + "/input"));
        if (!file.exists()) StringUtils.writeToFile(file, input);
        this.input = input.split("\n");
    }*/

    private void loadInput() throws FileNotFoundException {
        File file = new File("src/main/resources/days/day" + this.day + "/input.txt");
        System.out.println(file.getAbsolutePath());
        if (!file.exists()) throw new FileNotFoundException();
        String input = StringUtils.readFromFile(file);
        this.input = input.split("\n");
    }

}
