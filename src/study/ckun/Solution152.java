package study.ckun;

public class Solution152 {
    public static void main(String[] args) {
        int[] nums= {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums){
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}
