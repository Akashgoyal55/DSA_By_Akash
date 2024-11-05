package LeetCode.Searching.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] print = searchRange(nums, target);
        System.out.println(Arrays.toString(print));

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = firstIndex(nums, target);
        ans[1] = SecondIndex(nums, target);

        return ans;
    }

    //we have to run the binary search twice , first for first index and second for the last index of the target element
    static int firstIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans1 = -1;
        while(start<=end){

            int mid = start + (end-start)/2;

            if(target==nums[mid]){
                ans1 = mid; //possible answer
                end = mid-1; //more answer can lie on the left hand side of the middle element

            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans1;
    }

    //running binary search to find the last index of the target element
    static int SecondIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans2 = -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==nums[mid]){
                ans2 = mid; //possible answer
                start = mid+1; //more answer can lie on the right hand side of the middle element

            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans2;
    }

}

/*
* We use the same binary search
* We run the binary search code twice, for the first and last index of the target element
* if(target==nums[mid])  - here instead of returning the mid element, this mid element is the possible answer but their might be more possible answer on the left hand side
* So end = mid-1; - to find the first index, and start = mid+1; for the second binary search to find the last index of the target element
 */
