package study.ckun;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElementHash(nums));
    }

    public static int majorityElementHash(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for(Map.Entry<Integer, Integer> entry: counts.entrySet()) {
            if ((majorityEntry == null || entry.getValue() > majorityEntry.getValue())) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }

    public static Map<Integer, Integer> countNums(int[] nums){
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }else{
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }
}
