package Searching;

public class BinarySearch {
    static int binarySort(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8};
        int target = 6;
        int ans = binarySort(arr, target);
        System.out.println(ans);
    }
}