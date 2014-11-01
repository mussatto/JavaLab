package com.builder;

import java.util.Random;

public final class DataBuilder {

    public static long LOWER_RANGE = 0;
    public static long UPPER_RANGE = 1000000;

    public static Long[] buildVector(int size){
        Long[] vector = new Long[size];
        for(int i=0;i<size;i++){
            Random random = new Random();
            long randomValue = LOWER_RANGE +
                    (long)(random.nextDouble()*(UPPER_RANGE - LOWER_RANGE));

            vector[i]=randomValue;
        }
        return vector;
    }
}
