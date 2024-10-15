package Recursion.Arrays;
/*
* Linear search on multiple occurrences
* We will use arrayList to store the indices of the target element if the target exist more than one time
* Time Complexity: The time complexity is O(n), as the function iterates through the entire array once.
* Space Complexity: The space complexity is O(n), due to the recursion stack and the space used by the ArrayList to store the indices.
 */

import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,6,7,8};
        int target  = 6;
        findAllIndex(arr, target, 0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] ==target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
}
