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


    public int maxDepthUtil(TreeNode root)
    {
        if(root == null)
          return 0;

        int leftAns = maxDepthUtil(root.left);
        int rightAns = maxDepthUtil(root.right);

        int ans =  Math.max(leftAns,rightAns) + 1;
        return ans;
    }

    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
           return true;

        int leftHeight = maxDepthUtil(root.left);
        int rightHeight = maxDepthUtil(root.right);

        boolean ans = false;
        int diff = Math.abs(leftHeight - rightHeight);
        if(diff <= 1)
          ans = true;
        
        boolean leftAns = isBalanced(root.left);
        boolean rightAns = isBalanced(root.right);

        if(ans == true && leftAns == true && rightAns == true)
          return true;

        else
         return false;  
        
    }
}