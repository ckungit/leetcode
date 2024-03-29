package study.ckun;

import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum= nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
                if(sum > target){
                    end--;
                }else if(sum < target){
                    start++;
                }else{
                    return ans;
                }
            }
        }
        return ans;
    }
}
