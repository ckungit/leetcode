package study.ckun;

import java.util.*;

public class Solution884 {
    public static void main(String[] args) {
        String A="this apple is sweet";
        String B = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(A,B)));
    }

    public static String[] uncommonFromSentences(String A, String B){
        Map<String, Integer> count = new HashMap<>();
        for(String word: A.split(" ")){
            count.put(word, count.getOrDefault(word,0)+1);
        }
        for(String word: B.split(" ")){
            count.put(word, count.getOrDefault(word,0)+1);
        }
        List<String> ans = new LinkedList<>();
        for(String word: count.keySet()){
            if(count.get(word) == 1){
                ans.add(word);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
