package Arrays.Questions;
//Two Sum: Given an array of integers, find two numbers such that they add up to a specific target.

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,8};
        int target = 6;
        int[] ans = findNumbers(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] findNumbers(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int sum = arr[start] + arr[end];

            if(sum == target){
                return new int[] {start, end};
            }else if(target>sum){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}

//Time Complexity: The time complexity of this code is O(n), where n is the length of the array, as we traverse the array once using two pointers.
//Space Complexity: The space complexity is O(1), as no additional space is used beyond a few constant variables.
