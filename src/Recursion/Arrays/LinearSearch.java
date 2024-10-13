package Recursion.Arrays;
/*
* Linear search using recursion to find a target element in an array
* Here we have created 3 functions, first will show weather the element exist in the array, second index, third index from last
* In maximum case in questions like array the base condition will be when the index reach to the last index of the array
* Below the base says, if the index==arr.length, if the element already reach to the last element that means that does not exist
* In case of boolean it applies two conditions using || operator, At least one condition has to be true
* if the current element is equal to the target element otherwise move to the next element using index+1
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 15, 7, 8};
        int target = 7;
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexLast(arr, target, arr.length-1));
    }

    //recursion function
    static boolean find(int[] arr, int target, int index) {
        //base case
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    //To get the index of the target element
    static int findIndex(int[] arr, int target, int index){
        //base case
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
    }

    //To get the index from the last
    static int findIndexLast(int[] arr, int target, int index){
        //base case
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndexLast(arr, target, index-1);
        }
    }
}
