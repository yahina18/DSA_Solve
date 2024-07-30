class MinStack {

	private Stack<ArrayList<Integer>> stack;
    
    public MinStack() {
      
      stack = new Stack<ArrayList<Integer>>();
    }
    
    public void push(int val) {
        
			ArrayList<Integer> currList;
			
			if(stack.isEmpty()) {
				currList = new ArrayList<Integer>();
				currList.add(val);
				currList.add(val);
			}else {
				
				currList = stack.peek();
				int min = Math.min(currList.get(1), val);
				currList = new ArrayList<Integer>();
				currList.add(val);
				currList.add(min);
				
			}
            stack.push(currList);
			
		}
    
    public void pop() {
        if(stack.isEmpty())
           return;

        stack.pop();
    }
    
    public int top() {

       if(stack.isEmpty())
           return -1;

       return stack.peek().get(0);

    }

    public int getMin() {
       
       if(stack.isEmpty())
           return -1;

       return stack.peek().get(1);

    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */