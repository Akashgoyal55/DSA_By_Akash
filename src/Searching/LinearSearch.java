package Searching;
/*
Linear search is an algorithm use to find a target element in a array
It starts a counter from i=0, and check if the current element is the target element
In linear search we iterate through each element and here the worst case is when the target element is at the end
So we have to make n comparisons, that why time complexity = O(N)
Space complexity - O(1) The space complexity is constant because the algorithm only uses a few extra variables (i, arr, and target)
and does not require additional data structures such as arrays or lists that grow with the input size.
 */

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
