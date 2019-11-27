package study.ckun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution46 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        Solution46 solution46 = new Solution46();
        List<List<Integer>> permute = solution46.permute(nums);
        permute.stream().forEach(System.out::println);
    }

    private void generatePermution(int[] nums, boolean[] visited, int curSize, int len, Stack<Integer> path, List<List<Integer>> res){
        if(curSize == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < len; i++){
            if(!visited[i]){
                path.push(nums[i]);
                visited[i] = true;
                generatePermution(nums, visited, curSize + 1, len, path, res);
                path.pop();
                visited[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums){
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[len];
        if(len == 0){
            return res;
        }
        generatePermution(nums, used, 0, len, new Stack<>(), res);
        return res;
    }
}
