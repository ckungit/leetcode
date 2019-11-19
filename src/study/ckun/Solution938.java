package study.ckun;

public class Solution938 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode l = new TreeNode(5);
        TreeNode ll = new TreeNode(3);
        TreeNode lr = new TreeNode(7);
        TreeNode r = new TreeNode(15);
        TreeNode rr = new TreeNode(18);

        root.left=l;
        l.left=ll;
        l.right=lr;
        root.right=r;
        r.right=rr;
        System.out.println(rangeSumBST(root,7,15));
    }

    public static int rangeSumBST(TreeNode root, int L, int R){
        if(root == null){
            return 0;
        }
        if(root.val < L){
            return rangeSumBST(root.right,L,R);
        }
        if(root.val > R){
            return  rangeSumBST(root.left,L,R);
        }
        return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
    }
}
