package LeetCode.Sorting.Medium;
import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }

    static int threeSumClosest(int[] arr, int target){
        Arrays.sort(arr);

        int ans = arr[0]+arr[1]+arr[3];

        for(int i=0; i<arr.length-2; i++){
            int start = i+1;
            int end = arr.length-1;
            while(start<end){
                int sum = arr[i] + arr[start] + arr[end];

                if(sum>target){
                    end--;
                }else{
                    start++;
                }

                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
