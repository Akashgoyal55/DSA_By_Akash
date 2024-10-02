package Recursion;
/*
 - Binary search using recursion
 - "Divide and conquer relation" - example ; Binary search
 - Here the search space get reduced much faster in divide and conquer relation
 - Dividing something by 2 is more efficient than subtracting 2
 - If there are variables which you want to pass in the future function calls, put it inside the argument
 - And the variables which we do not need in the future function calls, put those inside the main body
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,13};
        int target = 10;
        System.out.println(search(arr, target, 0 , arr.length-1));
    }
    //function to find the target element in the array
    static int search(int[] arr, int target, int s, int e){
        //Base condition
        if(s>e){
            return -1;
        }

        int m = s +(e-s)/2;

        //Three conditions of finding the target element
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
