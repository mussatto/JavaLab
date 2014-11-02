package com.sorter;

public class InsertionSort implements Sorter{

    @Override
    public Long[] sort(Long[] array) {

        return new Long[0];
    }
    //TODO finish
    private Long[] insertionSort(Long[] array){

        int index =0;
        Long[] sorted = new Long[array.length];

        for(int i=0; i<=array.length; i++){
            Long lesser = array[i];
            int j = index;
            while(j>0 && array[j-1] > array[j]){
                if(array[index] < lesser){

                }
            }
            index++;
        }

        return sorted;
    }
}
