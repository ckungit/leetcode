package study.ckun;

public class Solution96 {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }

    public static int numTrees(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i < n + 1;i++){
            for(int j = 1;j < i + 1;j++){
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
