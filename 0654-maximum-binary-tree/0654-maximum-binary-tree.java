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
    private int findMaxIdx(int[] nums, int st, int end){
        int idx = st;

        for(int i = st; i <= end; i++){

            if(nums[idx] < nums[i]) idx = i;
        }
        return idx;
    }

    private TreeNode helpingConstructor(int[] nums, int st, int end){
        if(st > end) return null;
        if(st == end){
            return new TreeNode(nums[st]);
        }
        int maxIdx = findMaxIdx(nums, st, end);

        TreeNode tree = new TreeNode(nums[maxIdx]);

        tree.left = helpingConstructor(nums, st, maxIdx - 1);

        tree.right = helpingConstructor(nums, maxIdx + 1, end);
        return tree;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n = nums.length;
        return helpingConstructor(nums, 0, n - 1);

    }
}