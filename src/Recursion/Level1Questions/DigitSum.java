package Recursion.Level1Questions;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(345));
    }
    static int sum(int n){
        //base case
        if(n==0){
            return 0 ;
        }
        return (n%10)+sum(n/10);
    }
}
