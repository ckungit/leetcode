package study.ckun;

public class Solution104 {
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

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
}
