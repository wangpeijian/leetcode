// 二叉树的后序遍历 2022-01-30 09:47:10

//给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[3,2,1]
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
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 
// 👍 748 👎 0


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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //deep(root, list);
        it(root, list);

        return list;
    }

    private void deep(TreeNode node, List<Integer> list){

        if(node == null){
            return;
        }

        if(node.left != null){
            deep(node.left, list);
        }

        if(node.right != null){
            deep(node.right, list);
        }

        list.add(node.val);
    }

    private void it(TreeNode node, List<Integer> list){
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = node;
        TreeNode pre = null;

        boolean skipLeft = false;
        boolean skipRight = false;
        while (cur != null){

            if(pre != null){
                skipLeft = (pre == cur.left);
                skipRight = (pre == cur.right);
            }

            if(!skipLeft && !skipRight){
                while (cur != null){
                    stack.add(cur);
                    cur = cur.left;
                }

                if(stack.size() != 0){
                    cur = stack.pop();
                }
            }

            if(cur == null){

            }else if(!skipRight && cur.right != null){
                stack.add(cur);
                cur = cur.right;
            }else {
                list.add(cur.val);
                pre = cur;
                if(stack.size() != 0){
                    cur = stack.pop();
                }else {
                    cur = null;
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
