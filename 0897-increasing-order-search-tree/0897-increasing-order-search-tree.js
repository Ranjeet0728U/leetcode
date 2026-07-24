/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */

let curr;
function Inorder(root){
    if(root == null) return;
    Inorder(root.left);

    root.left = null;
    curr.right = root;
    curr = root;
    Inorder(root.right);
}
var increasingBST = function(root) {
    let tem = new TreeNode(0);
    curr = tem;
    Inorder(root);
    return tem.right;
};