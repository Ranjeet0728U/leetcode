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
    TreeNode curr;
    public void InOrder(TreeNode root){
        if(root == null) return;
        InOrder(root.left);

        root.left = null;
        curr.right = root;
        curr = root;

        InOrder(root.right); 
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = new TreeNode(0);
        curr = node;
        InOrder(root);
        return node.right;
    }
}