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
        
        List<Integer> ans = new ArrayList<Integer>();
        return rightSideViewUtil(root,ans,0);
        
    }

    public List<Integer> rightSideViewUtil(TreeNode root, List<Integer> ans, int level)
    {
        if(root == null)
          return new ArrayList<Integer>();

        if(level == ans.size())
        {
            ans.add(root.val);
        }
        
        rightSideViewUtil(root.right,ans,level+1);
           
        rightSideViewUtil(root.left,ans,level+1);
       
       return ans;
    }
}