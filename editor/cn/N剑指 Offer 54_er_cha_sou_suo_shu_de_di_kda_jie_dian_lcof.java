// 二叉搜索树的第k大节点 2022-02-19 22:12:21

//给定一棵二叉搜索树，请找出其中第 k 大的节点的值。 
//
// 
//
// 示例 1: 
//
// 
//输入: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//输出: 4 
//
// 示例 2: 
//
// 
//输入: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//输出: 4 
//
// 
//
// 限制： 
//
// 
// 1 ≤ k ≤ 二叉搜索树元素个数 
// 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 
// 👍 246 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int res = -1;
    int num = 0;

    public int kthLargest(TreeNode root, int k) {
        num = k;
        // 后序遍历
        deep(root);
        return res;
    }

    private void deep(TreeNode root){
        if(root.right != null){
            deep(root.right);
        }

        num--;

        if(num == 0 && res == -1){
            res = root.val;
            return;
        }

        if(root.left != null){
            deep(root.left);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
