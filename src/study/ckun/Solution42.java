package study.ckun;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class Solution42 {
    public int trap6(@NotNull int[] height){
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current < height.length){
            while(!stack.empty() && height[current] > height[stack.peek()]){
                int h = height[stack.peek()];
                stack.pop();
                if(stack.empty()){
                    break;
                }
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + distance * (min - h);
            }
            stack.push(current);
            current ++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        int[] height = {0,1,0,2,1,0,0,3,2,1,2,1};
        System.out.println(solution42.trap6(height));
    }
}
