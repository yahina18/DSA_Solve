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


    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
			return 0;
		
		int leftHeigthOfTree = diameterOfBinaryTree(root.left);
		int rigthHeigthOfTree = diameterOfBinaryTree(root.right);
		
		int node = maxDepthUtil(root.left)+maxDepthUtil(root.right);
		
		return (Math.max(Math.max(rigthHeigthOfTree, leftHeigthOfTree),node));   
    }
}