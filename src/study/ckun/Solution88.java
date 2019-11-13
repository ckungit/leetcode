package study.ckun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int len1 = m-1;
        int len2 = n-1;
        int len = m+n-1;
        while(len1 >= 0 && len2 >= 0){
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--]; // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
        }
        System.arraycopy(nums2,0,nums1,0,len2+1);
    }
}
