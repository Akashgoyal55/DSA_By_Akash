package Arrays.Questions;
//Find Missing Number: Given an array of size n-1 containing distinct numbers from 1 to n, find the missing number.
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(missingNumber(arr));
    }
    //function to find the missing number
    //Since it's asking for missing number and the range is tp 1-n, so we apply cyclic sort
    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;

            //sort the array first
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        //After sorting, the first index where the number is incorrect is the missing number
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    //swap method
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//Time Complexity: O(n), as we process each element at most twice (once to place it in the correct position and once to check for the missing number).
//Space Complexity: O(1), as no additional space is used except for a few constant variables.
