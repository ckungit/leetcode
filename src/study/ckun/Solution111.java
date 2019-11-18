package study.ckun;

import java.util.Map;

public class Solution111 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rleft = new TreeNode(15);
        TreeNode rright = new TreeNode(7);
        root.left = left;
        root.right = right;
        right.left = rleft;
        right.right = rright;

        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int ans = Integer.MAX_VALUE;
        if(root.left != null){
            ans = Math.min(minDepth(root.left), ans);
        }
        if(root.right != null){
            ans = Math.min(minDepth(root.right), ans);
        }
        return ans+1;
    }
}
