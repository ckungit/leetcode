package study.ckun;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    @NotNull
    private static List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        backtrack(ans,"",0,0,n);
        return ans;
    }

    private static void backtrack(List<String> ans, @NotNull String cur, int open, int close, int max){
        if(cur.length() == max * 2){
            ans.add(cur);
            return;
        }

        if(open < max){
            backtrack(ans, cur+"(", open+1,close,max);
        }
        if(close < open){
            backtrack(ans, cur+")", open,close+1, max);
        }
    }
}
