package Recursion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
* Returning an arrayList, by passing the answer list inside the parameter
* Note - Things that we add inside the parameter, that will be passed to function call
*        Things that we add inside the function body, it will only be available for that function call
* The time complexity of this code is O(n), where n is the number of elements in the array. The function iterates through the array once, adding indices of the target to the ArrayList.
* The space complexity is O(n), where n is the number of elements in the array. This is due to:

The recursion stack that grows linearly with the number of elements in the array (O(n)).
The ArrayList that stores the indices of occurrences of the target element (in the worst case, it can store up to n indices).
 */
public class allIndices {
    public static void main(String[] args) {
        int[] arr  = {3,5,6,7,8,8,9};
        int target = 8;
        ArrayList<Integer> ans = allIndices(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> allIndices(int[] arr, int target, int index, ArrayList<Integer> list){
        //Base case
        if(index==arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return allIndices(arr, target, index+1, list);
    }

}
