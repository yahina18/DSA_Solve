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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<Integer>();
        return inorderTraversalUtil(root,ans);
        
        
    }

    public List<Integer> inorderTraversalUtil(TreeNode root, List<Integer>ans)
    {
        if(root == null)
           return new ArrayList<Integer>();

        inorderTraversalUtil(root.left,ans);
        ans.add(root.val);
        inorderTraversalUtil(root.right,ans);
        return ans;
    }
}