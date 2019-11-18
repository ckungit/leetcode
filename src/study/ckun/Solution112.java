package study.ckun;

public class Solution112 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode l = new TreeNode(4);
        TreeNode ll = new TreeNode(11);
        TreeNode lll = new TreeNode(7);
        TreeNode llr = new TreeNode(2);
        TreeNode r = new TreeNode(8);
        TreeNode rl = new TreeNode(13);
        TreeNode rr = new TreeNode(4);
        TreeNode rrr = new TreeNode(1);

        root.left = l;
        root.right =r;
        l.left =ll;
        ll.left = lll;
        ll.left =llr;
        r.left = rl;
        r.right =rr;
        rr.right =rrr;

        System.out.println(hasPathSum(root, 23));
    }

    public static boolean hasPathSum(TreeNode root, int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && sum == root.val){
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
