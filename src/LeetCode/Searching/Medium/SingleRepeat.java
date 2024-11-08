package LeetCode.Searching.Medium;
/*
* Since we know all elements are in pair except one
* The index of first pair element should be even and index of second element should be odd
* We check the index of the middle element in order to check where does the target element lie
* mid%2==1, if mid element is at odd index, then we mid--, to make the mid element index even for easy check of mid and mid+1 as an pair
*
 */


public class SingleRepeat {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleDuplicate(nums));
    }

    static int singleDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;  //search on the right side
            } else {
                end = mid; //search on the left side
            }


        }
        return start;
    }


}
