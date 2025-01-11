package Searchi
public class findFirstandLastOccurence {
    public static void main(String[] args) {

    }
    //to find the first and last occurence of an target element in an sorted array
    //we will apply binary search twice
    static int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int first = -1; //assume this as an first element
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==nums[mid]){
                first = mid;
                end = mid-1;
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return first;
    }

    static int findLast(int[] arr, int target){
        int start = 0;
        int end = nums.length-1;
        int last = -1; //assume this as an last occurence of the target
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==nums[mid]){
                last = mid;
                start = mid+1; //more element can lie in the right
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return last;
    }
}
