package Sorting;
/*
- Cyclic sort algo is used to sort the array
- We apply cyclic sort when the range is given from [1,n] or [0,n]
- Here we take and check if that is at correctIndex otherwise swap with the correctIndex
- by using the formula, Index = value - 1
 */

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;

            if(arr[i]!=arr[correctIndex]){
                swap(arr, i ,correctIndex);
            }else{
                i++;
            }
        }
    }
    //swap method
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
