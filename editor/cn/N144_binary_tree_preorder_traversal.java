// 二叉树的前序遍历 2022-01-29 22:42:36

//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
//
// 
//输入：root = [1,2]
//输出：[1,2]
// 
//
// 示例 5： 
//
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 
// 👍 723 👎 0


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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //dlr(root, list);
        it(root, list);
        return list;
    }

    private void dlr(TreeNode node, List<Integer> list) {

        if (node == null) {
            return;
        }

        list.add(node.val);

        dlr(node.left, list);
        dlr(node.right, list);
    }

    private void it(TreeNode node, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        if (node == null) {
            return;
        }

        TreeNode cu = node;
        while (cu != null) {

            if (cu.right != null) {
                stack.add(cu.right);
            }

            list.add(cu.val);

            if (cu.left != null) {
                cu = cu.left;
            } else {
                if (stack.size() == 0) {
                    break;
                } else {
                    cu = stack.pop();
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
