// 平衡二叉树 2022-01-29 08:58:18

//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2,2,3,3,null,null,4,4]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 树中的节点数在范围 [0, 5000] 内 
// -104 <= Node.val <= 104 
// 
// Related Topics 树 深度优先搜索 二叉树 
// 👍 878 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
class Solution {
    boolean blance = true;

    public boolean isBalanced(TreeNode root) {
        count(root, 1);
        return blance;
    }

    private int count(TreeNode node, int lvl) {
        if (!blance) {
            return 0;
        }

        if (node == null) {
            return lvl - 1;
        }

        int l =  count(node.left, lvl + 1);
        int r =  count(node.right, lvl + 1);

        if (r - l > 1 || l - r > 1) {
            blance = false;
        }

        return Math.max(l, r);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
