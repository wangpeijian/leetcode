// 最小高度树 2022-02-10 23:19:07

//给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。示例: 给定有序数组: [-10,-3,0,5,9], 一个可能
//的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：           0          / \        -3 
//  9        /   /      -10  5 Related Topics 树 二叉搜索树 数组 分治 二叉树 
// 👍 112 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return deepSet(nums, 0, nums.length - 1);
    }

    private TreeNode deepSet(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(nums[start]);
        }

        // 找到中间节点
        int center = (start + end) / 2;
        TreeNode c = new TreeNode(nums[center]);

        // 先左 后右设置子节点
        if (start <= center - 1) {
            c.left = deepSet(nums, start, center - 1);
        }

        if (center + 1 <= end) {
            c.right = deepSet(nums, center + 1, end);
        }

        return c;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
