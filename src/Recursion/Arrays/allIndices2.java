package Recursion.Arrays;

import java.util.ArrayList;

/*
* Return the list without passing the argument
* Goal - return the list without taking the argument inside the parameter, create a list in the body of the function itself
 */
public class allIndices2 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,7,8};
        System.out.println(findAllIndices2(arr, 7, 0));
    }

    static ArrayList<Integer> findAllIndices2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        //Base case
        if(index==arr.length){
            return list;
        }

        //This will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall = findAllIndices2(arr, target, index+1);

        list.addAll(ansFromBelowCall);

        return list;
    }
}
