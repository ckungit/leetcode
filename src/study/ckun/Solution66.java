package study.ckun;

public class Solution66 {
    public static void main(String[] args) {
        int[] digits = {5,1,9};
        String result = "";
        digits = plusOne(digits);
        for (int i:digits) {
            result = result + String.valueOf(i);
        }
        System.out.println(result);
    }

    public static int[] plusOne(int[] digits){
        int len = digits.length;
        for(int i = len - 1; i>=0;i--){
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
