package Arrays;
/*
 - Taking two variable start and end
 - Everytime increment start by 1 and decrement end by 1
 - We won't be able to swap once end>start
 - Time complexity is O(n) because the function iterates through half of the array, performing a constant-time swap operation on each pair of elements.
 - Space complexity is O(1) because the function only uses a few extra variables and does not allocate additional space proportional to the input size.
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
