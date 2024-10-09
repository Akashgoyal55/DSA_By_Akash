package Recursion.Level1Questions;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(10200));
    }
    static int count(int n){
        return helper(n,0);
    }

    //We can create a helper function when needed in recursion
    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        int remain = n%10;
        if(remain==0){
            return helper(n/10 , c+1);
        }
        return helper(n/10 , c);
    }
}
