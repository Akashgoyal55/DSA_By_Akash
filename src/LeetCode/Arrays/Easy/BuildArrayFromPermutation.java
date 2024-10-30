package LeetCode.Arrays.Easy;
import java.util.*;
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArrays(nums)));
    }
    static int[] buildArrays(int[] nums){
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
