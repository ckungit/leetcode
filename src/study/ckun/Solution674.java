package study.ckun;

public class Solution674 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums){
        if(nums.length <= 1){
            return nums.length;
        }
        int ans = 1;
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] > nums[i]){
                count++;
            }else{
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
