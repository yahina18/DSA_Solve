class MyStack {
    

    Queue<Integer> q1 = new LinkedList<Integer>(); 
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
        int size = q1.size();
        for(int i = 0; i < size-1; i++)
        {
            int element = q1.poll();
            q1.add(element);
        }
        
    }
    
    public int pop() {
        
       return q1.remove();

    }
    
    public int top() {

        return q1.peek();
    }
    
    public boolean empty() {
        
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */