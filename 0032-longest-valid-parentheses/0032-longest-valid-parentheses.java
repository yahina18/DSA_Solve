class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        return findLongestParenthesis(s,stack);
    }

    public int findLongestParenthesis(String s, Stack<Integer> stack)
	{
		stack.push(-1);
		int maxLen = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(')
				stack.push(i);
			else {
				
				stack.pop();
				
				if(stack.isEmpty())
					stack.push(i);
				
				
				int len = i - stack.peek();
				maxLen = Math.max(maxLen, len);
				
				
			}
			
			
		}
		return maxLen;
		
		
	}




}