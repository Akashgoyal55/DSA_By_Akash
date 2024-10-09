package Recursion.Level1Questions;
//here we have to print the product of n to 1 that is a factorial of a number
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
    static int fact(int n){
        //base case
        if(n<=1){
            return 1;
        }
        return n* fact(n-1);
    }

}
