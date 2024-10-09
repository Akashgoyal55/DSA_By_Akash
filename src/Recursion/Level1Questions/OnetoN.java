package Recursion.Level1Questions;
//here we have to print number 1 to n, assume n=5. Output should be 1,2,3,4,5
public class OnetoN {
    public static void main(String[] args) {

    }
    static void function(int n){
        //base case
        if(n==0){
            return;
        }
        function(n-1);
        System.out.println(n);
    }
}
