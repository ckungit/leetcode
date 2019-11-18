package study.ckun;

public class Solution162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5};
        System.out.println(findPeekElement(nums));
    }

    public static int findPeekElement(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        for(;left < right;){
            int mid =left + (right - left)/2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
