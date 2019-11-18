package study.ckun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution216 {
    public static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int k = 3;
        int n = 9;
        System.out.println(combinationSum3(k,n));
    }

    public static List<List<Integer>> combinationSum3(int k, int n){
        traceBack(k,n,0,1,new LinkedList<>());
        return ans;
    }

    public static void traceBack(int k, int n, int sum, int begin, LinkedList<Integer> list){
        if(k == 0){
            if(n == sum){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i = begin;i<10;i++){
            list.add(i);
            traceBack(k-1,n,sum+1,i+1,list);
            list.removeLast();
        }
    }
}
