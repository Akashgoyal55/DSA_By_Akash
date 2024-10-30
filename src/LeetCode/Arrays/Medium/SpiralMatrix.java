package LeetCode.Arrays.Medium;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> ans = new ArrayList<>();
        //base case
        if(matrix==null || matrix.length==0)
            return ans;

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bottom && left<=right){

            //---------> left to right
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //right to left
            for(int i=right; i>=left; i-- ){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            //bottom to top
            for(int i=bottom; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;

        }
        return ans;

    }
}

/*

The time and space complexity analysis of this code for spiral traversal of an
𝑚
×
𝑛
m×n matrix is as follows:

Time Complexity
The code traverses each element in the matrix exactly once.
Therefore, the time complexity is
𝑂
(
𝑚
×
𝑛
)
O(m×n), where
𝑚
m is the number of rows and
𝑛
n is the number of columns.
Space Complexity
The space complexity consists of two main parts:

Output List (ans): This list stores all
𝑚
×
𝑛
m×n elements in the matrix.
This requires
𝑂
(
𝑚
×
𝑛
)
O(m×n) space.
Constant Extra Space for Variables: The code uses a fixed number of variables (top, bottom, left, right, and a few loop counters).
These variables require
𝑂
(
1
)
O(1) space.
Therefore, the overall space complexity is dominated by the output list, which makes it
𝑂
(
𝑚
×
𝑛
)
O(m×n).
 */
