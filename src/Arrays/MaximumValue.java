package Arrays;
/*
Time complexity is O(n) because the function iterates through the entire array once to compare each element with the current maximum.
Space complexity is O(1) because the function uses only a single variable (maxValue) to store the maximum value, requiring constant space regardless of the array size.
 */

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,9};
        System.out.println(max(arr));
    }
    //method to search for the maximum element
    static int max(int[] arr){
        int maxValue = arr[0]; //assume this is the max value
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
