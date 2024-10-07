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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        return preorderTraversalUtil(root,ans);

    }

    public List<Integer> preorderTraversalUtil(TreeNode root, List<Integer> ans)
    {
         if(root == null)
           return new ArrayList<Integer>();

         ans.add(root.val);
         preorderTraversalUtil(root.left,ans);
         preorderTraversalUtil(root.right,ans);

         return ans; 
    }
}