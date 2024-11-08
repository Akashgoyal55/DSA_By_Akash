package LeetCode.Sorting.Medium;
import java.util.*;
//we have been given an array, and we have to found pairs of 3 numbers whose sum is equal to 0 and return all those pairs
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-4,-1,-1,0,1,2};
        System.out.println(threeSum(arr));
    }
    static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(arr); //make sure the array is sorted to avoid duplicates

        for(int i=0; i<arr.length-2; i++){ //taking the first element (a) and searching for b, c
            if(i==0 || (i>0 && arr[i]!=arr[i-1])){ //checking for duplicates
                //if the above condition is true, then we will apply two sum approach
                int start = i+1;
                int end = arr.length-1;
                int target = 0-arr[i];
                while(start<end){
                    if(arr[start]+arr[end]==target){
                        answer.add(Arrays.asList(arr[i], arr[start], arr[end])); //answer found, add this values

                        while(start<end && arr[start]==arr[start+1]) start++;
                        while(start<end && arr[end]==arr[end-1]) end--;

                        start++;
                        end--;
                    }else if(arr[start]+arr[end]>target){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        return answer;
    }
}
