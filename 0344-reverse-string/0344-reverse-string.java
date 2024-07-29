class Solution {
    public void reverseString(char[] s) {
        
        java.util.Stack<Character> stack = new java.util.Stack<Character>();
        for(int i = 0; i < s.length; i++)
        	stack.add(s[i]);
        
        while(!stack.isEmpty())
        {
        	for(int i = 0; i < s.length; i++)
            {
                s[i] = stack.pop();
            }
        }

    }
}