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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return hasPathSumUtil(root,targetSum,0);
    }

    public boolean hasPathSumUtil(TreeNode root, int targetSum, int currentSum)
    {
        if(root == null)
           return false;

         if(root.left == null && root.right == null)
         {
              currentSum += root.val;
              if(currentSum == targetSum)
                 return true;            
         }

         boolean leftAns = hasPathSumUtil(root.left,targetSum, currentSum + root.val);
         boolean rightAns = hasPathSumUtil(root.right,targetSum, currentSum + root.val);

         return leftAns || rightAns;
    }
}