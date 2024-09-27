package Searching;

public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {13,4,7,33,6,9};
        int target = 7;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}
