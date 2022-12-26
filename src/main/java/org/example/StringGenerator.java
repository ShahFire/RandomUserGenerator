package org.example;

import static org.example.Randomizer.randomWithRange;

public class StringGenerator {
    private static String latinAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String generateRandomString(String line, int counter) {
        String str = "";
        for (int i = 0; i < counter; i++)
        {
            char symbol = line.charAt(randomWithRange(0, line.length() - 1));
            str += symbol;
        }
        return str;
    }
    public static String generateLatin(int counter) {
        return generateRandomString(latinAlphabet, counter);
    }
}
