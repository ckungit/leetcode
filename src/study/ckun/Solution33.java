package study.ckun;

import java.util.Arrays;

public class Solution33 {
    public static void main(String[] args) {
        int[] nums = {1,5,8,4,7,6,5,3,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start){
        int i = start, j = nums.length - 1;
        while (i<j){
            swap(nums,i,j);;
            j--;
            i++;
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void nextPermutation(int[] nums){
        int i = nums.length-2;
        while ((i >= 0 && nums[i+1] <= nums[i])){
            i--;
        }
        if(i >= 0){
            int j = nums.length-1;
            while (j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
}
