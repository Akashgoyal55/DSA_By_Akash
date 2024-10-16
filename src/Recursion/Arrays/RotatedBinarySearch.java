package Recursion.Arrays;
/*
* Here, we will see all possible case exist, just make recursion call for that
* s = start, e = end
* Time Complexity: The time complexity is O(log n), as the search space is halved with each recursive call.
Space Complexity: The space complexity is O(log n), due to the recursive call stack in a binary search.

 */
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,9,10,13};
        System.out.println(search(arr, 10, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e ){
        //base case
        if(s>e){
            return -1;
        }

        int m = s +(e-s)/2;

        //applying three cases here
        if(arr[m] == target ){
            return m;
        }

        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return search(arr, target, s, m-1);
            }else{
                return search(arr, target, m+1, e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return search(arr, target, m+1, e);
        }else{
            return search(arr, target, s, m-1);
        }
    }

}
