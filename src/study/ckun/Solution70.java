package study.ckun;

public class Solution70 {
    public static void main(String[] args) {
        System.out.println("菲波那切数列： " + climbStairsFibonacci(6));
        System.out.println("动态规划： " + climbStairsDynamic(6));
    }

    public static Integer climbStairsFibonacci(Integer n){
        double sqrt_5 = Math.sqrt(5);
        double fib_n = Math.pow((1+sqrt_5)/2,n+1)-Math.pow((1-sqrt_5)/2,n+1);
        Double resule = fib_n/sqrt_5;
        return resule.intValue();
    }

    public static Integer climbStairsDynamic(Integer n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
