package study.ckun;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution78 solution = new Solution78();
        List<List<Integer>> res = solution.subsets(nums);
        System.out.println(res);
    }

    @NotNull
    private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,nums,res,new ArrayList<Integer>());
        return res;
    }

    private void backtrack(int i, @NotNull int[] nums, @NotNull List<List<Integer>> res, ArrayList<Integer> tmp){
        res.add(new ArrayList<>(tmp));
        for(int j = i; j < nums.length; j++){
            tmp.add(nums[j]);
            backtrack(j+1,nums,res,tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
