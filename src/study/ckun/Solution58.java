package study.ckun;

public class Solution58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' '){
            end --;
        }
        if(end < 0){
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' '){
            start --;
        }
        return end - start;
    }


}
