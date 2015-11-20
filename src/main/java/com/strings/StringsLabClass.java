package com.strings;

/**
 * Created by vitormussatto on 03/05/15.
 */
public class StringsLabClass {
    public static void main(String[] args){
        String one = "first string";
        String two = "first string";

        if(one==two){
            System.out.println("one equals two");
        }


        int i;
        int j;
        for (i=1; i < 4; i++) {
            for (j = 2; j < 4; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}
