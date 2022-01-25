import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


public class N94_binary_tree_inorder_traversal {

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
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> res = new Solution().inorderTraversal(treeNode1);

        res.forEach(System.out::println);
    }


    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            // 先找左/然后根/然后右 LDR
            List<Integer> result = new ArrayList<>();

            if (root != null) {
                go(root, result);
            }

            return result;
        }

        private void go(TreeNode root, List<Integer> result) {

            if (root.left != null) {
                go(root.left, result);
                result.add(root.val);
            } else {
                result.add(root.val);
            }

            if (root.right != null) {
                go(root.right, result);
            }
        }
    }

}


