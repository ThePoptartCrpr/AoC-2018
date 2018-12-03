package com.thepoptartcrpr.aoc2018.utils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class StringUtils {

    public static String getStringFromCharArray(char[] array) {
        StringBuilder builder = new StringBuilder();
        for (char ch : array) builder.append(ch);
        return builder.toString();
    }

    public static String readFromFile(File file) throws FileNotFoundException {
        if (!file.exists()) throw new FileNotFoundException();
        Scanner scanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNextLine()) builder.append(scanner.nextLine() + "\n");
        return builder.toString();
    }

    public static void writeToFile(File file, String string) throws IOException {
        Files.write(Paths.get(file.getAbsolutePath()), string.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
    }

    // TODO: possibly merge the following two
    public static String loadFromUrl(URL url) throws MalformedURLException, IOException {
        URLConnection connection = url.openConnection();
        InputStream stream = connection.getInputStream();
        String encoding = connection.getContentEncoding();
        return ioToString(stream, encoding);
    }

    public static String ioToString(InputStream input, String encoding) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int length = 0;
        while ((length = input.read(buffer)) != -1) {
            baos.write(buffer, 0, length);
        }
        return new String(baos.toByteArray(), encoding);
    }

}
