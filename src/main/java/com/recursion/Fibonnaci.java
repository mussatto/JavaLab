package com.recursion;


public class Fibonnaci {

    public static Integer getNumberAt(int iteration){
        if(iteration<=1){
            return iteration;
        }else{
            return getNumberAt(iteration-1) + getNumberAt(iteration-2);
        }
    }
}
