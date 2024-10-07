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
    public List<List<Integer>> levelOrder(TreeNode root) {
           
           List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(root == null) {
			return ans;
		}
			
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(!queue.isEmpty()){
				
			TreeNode temp = queue.peek();
			queue.poll();
			
			if(temp == null){
				
				ans.add(list);
				if(!queue.isEmpty())
				{
					queue.add(null);
		            list = new ArrayList<Integer>();  				
				}					
			}else{
				
				list.add(temp.val);

				if(temp.left != null){
					queue.add(temp.left);
				}
				if(temp.right != null){
					queue.add(temp.right);
				}
			}
				
			
		}
		
		return ans;


    }
}