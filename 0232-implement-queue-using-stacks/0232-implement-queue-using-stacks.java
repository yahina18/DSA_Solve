class MyQueue {
    
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public MyQueue() {
        
    }
    
    public void push(int x) {

        s1.add(x);
        
    }
    
    public int pop() {
        
        int pop = -1;

        if(!s2.isEmpty())
            pop = s2.peek();
        else{
           
           while(!s1.isEmpty())
           {
              s2.add(s1.peek());
              s1.pop();
           }
           pop = s2.peek();
        }    
      s2.pop();
      return pop;
    }
    
    public int peek() {
        
        int top = -1;

        if(!s2.isEmpty())
            top = s2.peek();
        else{
           
           while(!s1.isEmpty())
           {
              s2.add(s1.peek());
              s1.pop();
           }
           top = s2.peek();
           //s2.pop();
        }    
      return top;
    }
    
    public boolean empty() {
        
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */