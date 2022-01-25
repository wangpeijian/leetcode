import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class N100_same_tree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static void main(String[] args) {
        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode12 = new TreeNode(2);
        TreeNode treeNode13 = new TreeNode(3);
        TreeNode treeNode14 = new TreeNode(4);
        TreeNode treeNode15 = new TreeNode(5);

        treeNode11.left = treeNode12;
        treeNode11.right = treeNode13;

        treeNode13.left = treeNode14;
        treeNode13.right = treeNode15;

        TreeNode treeNode21 = new TreeNode(1);
        TreeNode treeNode22 = new TreeNode(2);
        TreeNode treeNode23 = new TreeNode(3);

        treeNode21.left = treeNode22;
        treeNode21.right = treeNode23;

        Boolean b = new Solution().isSameTree(treeNode11, treeNode21);

        System.out.println(b);
    }
    
   static class Solution {

        public boolean isSameTree(TreeNode p, TreeNode q) {

            if(p != null && q != null){
                if(p.val == q.val){
                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                }
            }else if(p == null && q == null){
                return true;
            }

            return false;
        }
    }
    
}
