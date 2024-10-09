package Recursion.Level1Questions;
//Here we have to print number N to 1, let's say here n = 5, output should be 5,4,3,2,1
public class Nto1 {
    public static void main(String[] args) {
        function(5);
    }
    //recursion function
    static void function(int n ){
        //base case
        if(n==0){
            return;
        }
        System.out.println(n);
        function(n-1);
    }
}

/*
Time Complexity: O(n), since the function is called recursively n times.
Space Complexity: O(n), due to the recursive call stack depth of n.
 */