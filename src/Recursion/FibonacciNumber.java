package Recursion;
/*
 - Fibonacci number is the sum of previous two numbers
 - This is a linear Recurrence relation "which is very inefficient"
 - Because the bigger number is getting smaller in a very small - small steps
 - Let's say the question asked us to find the 4th fibonacci number
 */

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        //Base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+ fibo(n-2);
    }
}
