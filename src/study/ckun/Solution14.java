package study.ckun;

public class Solution14 {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String ans = strs[0];
        for(int i=1;i<strs.length;i++){
            int j = 0;
            for(;j<ans.length() && j<strs[i].length();j++){
                if(ans.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            if(ans.equals("")){
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution14.longestCommonPrefix(strs));
    }
}
