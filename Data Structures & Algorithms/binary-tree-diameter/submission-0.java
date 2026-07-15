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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
        
        
        
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int diameter = leftHeight+rightHeight;
            res = Math.max(diameter,res);
            return 1+Math.max(leftHeight,rightHeight);

        }
        
        
            
     
    }
}
