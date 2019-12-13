package study.ckun;

import org.jetbrains.annotations.NotNull;

public class Solution221 {
    private int maximalSquare(@NotNull char[][] matrix){
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[] dp = new int[cols + 1];
        int maxsqlen = 0;
        int prev = 0;
        for(int i = 1;i <= rows; i++){
            for(int j = 1;j <= cols; j++){
                int temp = dp[j];
                if(matrix[i - 1][j - 1] == '1'){
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[j]);
                }else{
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsqlen * maxsqlen;
    }


    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        Solution221 solution221 = new Solution221();
        System.out.println(solution221.maximalSquare(matrix));
    }
}
