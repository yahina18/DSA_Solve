class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else {
				if(!stack.isEmpty())
				{
					char topElement = stack.peek();
					if(ch == ')' && topElement == '(')
						stack.pop();
					else if(ch == ']' && topElement == '[')
						stack.pop();
					else if(ch == '}' && topElement == '{')
						stack.pop();
					else 
						return false;
						  
				}else
					return false;
				
				
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;

    }
}