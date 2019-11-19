package study.ckun;

public class Solution11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int maxarea = 0;
        int l = 0;
        int r = height.length - 1;
        while(l<r){
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r-1));
            if (height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}
