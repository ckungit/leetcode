package study.ckun;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution55 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        Solution55 solution55 = new Solution55();
        System.out.println(solution55.canJump(nums));
    }

    enum Index{
        GOOD,BAD,UNKNOWN
    }

    @Contract(pure = true)
    private boolean canJump(@NotNull int[] nums){
        Index[] memo = new Index[nums.length];
        for(int i = 0; i < memo.length; i++){
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;

        for(int i = nums.length - 2; i >= 0; i--){
            int furthestJump = Math.min(i+nums[i], nums.length-1);
            for(int j = i + 1; j <= furthestJump; j ++){
                if(memo[j] == Index.GOOD){
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }
        return memo[0] == Index.GOOD;
    }
}
