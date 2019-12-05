package study.train;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BubbleSort {
    private void sort(@NotNull int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {6,5,8,2,9,1,5};
        bubbleSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
