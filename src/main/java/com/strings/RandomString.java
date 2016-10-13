package com.strings;

import java.util.Random;

/**
 * Created by mussatto on 06/10/16.
 */
public class RandomString {
    private static Random r = new Random();
    private static String alphabet = "1234567890abcdefghijklmxyzABCDEFGHIJKLMNOPQRSTUVXYZ";

    public static String getRandomChar(){
        return String.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
    }
}
