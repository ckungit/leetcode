package study.ckun;

import java.util.LinkedList;
import java.util.Queue;

public class Solution101 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(2);
        TreeNode left3 = new TreeNode(3);
        TreeNode left4 = new TreeNode(4);
        TreeNode rigth4 = new TreeNode(4);
        TreeNode right3 = new TreeNode(3);
        root1.left = left2;
        left2.left = left3;
        left2.right = left4;
        root1.right = right2;
        right2.left = rigth4;
        right2.right = right3;
        System.out.println("递归： " + isSymmetric(root1));
        System.out.println("迭代： " + isSymmetricIteration(root1));
    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) {
            return true;
        }else if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.right,t2.left)&&(isMirror(t1.left,t2.right));
    }

    public static boolean isSymmetricIteration(TreeNode root){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null){
                continue;
            }
            if(t1 == null || t2 == null){
                return false;
            }
            if(t1.val != t2.val){
                return false;
            }
            q.offer(t1.left);
            q.offer(t2.right);
            q.offer(t1.right);
            q.offer(t2.left);
        }
        return true;
    }
}
