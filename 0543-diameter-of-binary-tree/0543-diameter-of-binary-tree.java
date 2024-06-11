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
    
    public int height(TreeNode tree){
        if(tree==null){
            return 0;
        }
        int lh = height(tree.left);
        int rh = height(tree.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode tree) {
        if(tree==null){
            return 0;
        }
        int ldiam = diameterOfBinaryTree(tree.left);
        int rdiam = diameterOfBinaryTree(tree.right);
        int self_diam = height(tree.left) + height(tree.right); 
        return Math.max(self_diam,Math.max(ldiam, rdiam));
    }
}