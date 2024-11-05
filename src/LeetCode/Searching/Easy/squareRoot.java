package LeetCode.Searching.Easy;

public class squareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(8));

    }
    static int sqrt(int x){
        if(x<2){
            return x;
        }

        int start = 0;
        int end = x/2;
        int ans = 0;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid<=x/mid){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
