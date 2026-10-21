class Solution {

    public long helper(TreeNode root, int min ){

        if(root == null) return Long.MAX_VALUE;

        if(root.val > min) return root.val;

        long left = helper(root.left, min);
        long right = helper(root.right, min);

        return Math.min( left, right );
    }

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        
        long result = helper(root, root.val);

        return result == Long.MAX_VALUE ? -1 : (int)result;
    }
}