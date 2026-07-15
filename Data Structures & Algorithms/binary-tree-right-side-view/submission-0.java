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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null){
            q.add(root);
        }
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=size;i>0;i--){
                TreeNode node = q.poll();
                if(i==size&&node!=null){
                    res.add(node.val);
                }
                if(node!=null){
                    if(node.right != null){
                        q.add(node.right);
                    }
                    if(node.left != null){
                        q.add(node.left);
                    }
                    
                    
                }
                
            }
            
        }
        return res;
        
    }
}
