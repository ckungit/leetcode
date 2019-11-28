package study.ckun;

public class Solution287 {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums){
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        while (left < right){
            int mid = (left + right) >>> 1;
            int counter = 0;
            for(int num: nums){
                if(num <= mid){
                    counter += 1;
                }
            }
            if(counter > mid){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
