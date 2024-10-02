package Arrays;
import java.util.Arrays;
/*
 - How to swap two values
 - Time complexity is O(1) because the function performs a constant number of operations (three assignments) regardless of the array size.
 - Space complexity is O(1) because only a single temporary variable (temp) is used, which requires constant space.
 */
public class Swapping {
    public static void main(String[] args) {

        int[] arr = {1,5,7,3,9};
        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

