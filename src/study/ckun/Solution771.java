package study.ckun;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }

    public static int numJewelsInStones(String J, String S){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<J.length();i++){
            set.add(J.charAt(i));
        }
        int ans = 0;
        for(int i = 0;i<S.length();i++){
            if(set.contains(S.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }
}
