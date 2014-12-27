package com.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedVsArray {

    public static void main(String[] args){

        List<Integer> array = new ArrayList<Integer>();
        List<Integer> linked = new LinkedList<Integer>();

        doTimings(10000000, array);
        doTimings(10000000, linked);
    }


    public static void doTimings(int iterations, List<Integer> list){
        long timeStart = new Date().getTime();
        for(int i =0; i < iterations; i++){
            list.add(i);
        }

        long timeEnd = new Date().getTime();

        System.out.println("Elapsed: " + (timeEnd - timeStart));
    }
}
