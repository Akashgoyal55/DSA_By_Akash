package LeetCode.Sorting.Easy;
import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        mergeSortedArrays(nums1,m, nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n){
        //since we have been asked to pass two elements in one iteration, so we will use two pointers approach
        int i  = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums2[j] = nums1[k];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}
