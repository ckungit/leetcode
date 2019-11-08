package study.ckun;

import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution136 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,5,3,2,5};
        System.out.println(singleNumber(nums));
    }

    public static Integer singleNumber(int[] nums){
        int ans = 0;
        for (int num:nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}
