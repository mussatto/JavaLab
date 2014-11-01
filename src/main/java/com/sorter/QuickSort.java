package com.sorter;

public class QuickSort {

    public static Long[] sort(Long[] unsortedArray){
        return quickSort(unsortedArray, 0, unsortedArray.length-1);
    }

    public static Long[] quickSort(Long[] unsortedArray, int start, int end){
        if(start < end){
            int pivotPosition = partition(unsortedArray, start, end);

            quickSort(unsortedArray, start, pivotPosition-1);
            quickSort(unsortedArray, pivotPosition+1, end);
        }

        return unsortedArray;
    }

    public static int partition(Long[] unsortedArray, int start, int end){
        Long pivotValue = unsortedArray[start];
        Long swap;

        int i = start+1;
        int j = end;

        while(i <= j){
            if(unsortedArray[i] <= pivotValue){
                i++;
            }
            else if( unsortedArray[j] > pivotValue){
                j--;
            }else{
                swap = unsortedArray[i];
                unsortedArray[i]=unsortedArray[j];
                unsortedArray[j]=swap;
                i++;
                j--;
            }


        }
        unsortedArray[start] = unsortedArray[j];
        unsortedArray[j] = pivotValue;
        return j;

    }
}
