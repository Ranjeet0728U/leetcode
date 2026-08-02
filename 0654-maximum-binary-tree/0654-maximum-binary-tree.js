/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */

 const findMaxIdx = function(nums, st, end){
    let maxIdx = st;

    for(let i = st; i <= end; i++){
        if(nums[i] > nums[maxIdx]) maxIdx = i;
    }
    return maxIdx;
 }
 const helperbinaryTree = function(nums, st, end){
    if(st > end) return null;
    if(st == end) return new TreeNode(nums[st]);

    let maxIdx = findMaxIdx(nums, st, end);

    const tree = new TreeNode(nums[maxIdx]);
    tree.left = helperbinaryTree(nums, st, maxIdx - 1);
    tree.right = helperbinaryTree(nums, maxIdx + 1, end);

    return tree;
 }
var constructMaximumBinaryTree = function(nums) {
    const n = nums.length;
    return helperbinaryTree(nums, 0, n - 1);
};