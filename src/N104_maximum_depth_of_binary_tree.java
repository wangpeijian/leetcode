public class N104_maximum_depth_of_binary_tree {

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

    static public class TreeNode {
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
        TreeNode r1 = new TreeNode(1);
        TreeNode l111 = new TreeNode(1);
        TreeNode l11 = new TreeNode(1, null, l111);
        TreeNode l1 = new TreeNode(1, l11, null);
        TreeNode root = new TreeNode(1, l1, r1);

        System.out.println(new Solution().maxDepth(root));
    }

    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root != null) {
                return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
            }

            return 0;
        }

    }

}
