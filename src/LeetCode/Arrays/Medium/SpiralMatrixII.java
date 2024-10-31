package LeetCode.Arrays.Medium;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] result = generateMatrix(3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    static int[][] generateMatrix(int n){
        int[][] ans = new int[n][n]; //same row and column

        //4 variables to cover all the corners of the 2-D array
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;
        int value = 1; //initialize the ans with 1, answer keep on inserting answer here going through the loop

        while(startRow<=endRow && startCol<=endCol){
            //fill first row - 1,2,3
            for(int i=startCol; i<=endCol; i++){
                ans[startRow][i] = value++; //here the row will be same only the column will change
            }
            startRow++;

            //fill the end column
            for(int i=startRow; i<=endRow; i++){
                ans[i][endCol] = value++;
            }
            endCol--;

            if(startRow<=endRow){
                //fill last row
                for(int i=endCol; i>=startCol; i--){
                    ans[endRow][i] = value++; //here row will be same, only the column will change
                }
                endRow--;
            }
            if(startCol<=endCol){
                //fill first column
                for(int i=endRow; i>=startRow; i--){
                    ans[i][startCol] = value++;
                }
                startCol++;
            }
        }
        return ans;
    }
}
