package study.ckun;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        Solution75 solution75 = new Solution75();
        solution75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void sortColors(@NotNull int[] nums){
        int p0 = 0;
        int curr = 0;
        int p2 = nums.length-1;
        int tmp;

        while(curr <= p2){
            if(nums[curr] == 0){
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }else if(nums[curr] == 2){
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            }else{
                curr++;
            }
        }
    }
}
