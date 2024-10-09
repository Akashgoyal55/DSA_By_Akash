package Recursion.Arrays;
//Here we have to check weather the array is sorted in ascending order using recursion
/*
* Concept - Start from index 0 and compare each element with next element weather the next element is greater or not
* Take the copy of the array and change the by one each time
 */
public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,9};
        System.out.println(sorted(arr,0)); //initialize from index 0
    }

    static boolean sorted(int[] arr, int index){
        //base case
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
