package Recursion.Level1Questions;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(product(34));
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
