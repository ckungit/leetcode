package study.ckun;

import java.util.Random;

public class Solution215 {
    private int[] nums;

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        Solution215 solution215 = new Solution215();
        System.out.println(solution215.findKthLargest(nums,k));
    }

    private void swap(int a,int b){
        int tmp = this.nums[a];
        this.nums[a] = this.nums[b];
        this.nums[b] = tmp;
    }

    private int partition(int left, int right, int pivot_index){
        int pivot = this.nums[pivot_index];
        swap(pivot_index,right);
        int store_index = left;

        for(int i = left; i <= right; i++){
            if(this.nums[i] < pivot){
                swap(store_index, i);
                store_index++;
            }
        }

        swap(store_index, right);

        return store_index;
    }

    private int quickselect(int left, int right, int k_smallest){
        if(left == right){
            return this.nums[left];
        }

        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left);
        pivot_index = partition(left, right, pivot_index);

        if(k_smallest == pivot_index){
            return this.nums[k_smallest];
        }else if(k_smallest < pivot_index){
            return quickselect(left, pivot_index - 1, k_smallest);
        }else{
            return quickselect(pivot_index + 1, right, k_smallest);
        }
    }

    public int findKthLargest(int[] nums, int k){
        this.nums = nums;
        int size = nums.length;
        return quickselect(0, size - 1, size - k);
    }
}
