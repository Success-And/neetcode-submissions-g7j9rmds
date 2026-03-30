class MinStack {
    // Creating two stacks for the class one will always have the minimum value in the stack
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // COnstructor with initialization of both stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    // This method will push a value to the firts stack and it will check if the second stack is empty or if the value that
    // already is in the stack is less then the previous one to switch the minimum value and place it in the second stack
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()){
                minStack.push(val);
        }
        
    }
    
    // This method remove the top item of the stack and it will also check if the value being removed from the first stack is the 
    // same as the value of the minStack to update it and remove it if the condition is true
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }
    
    // This method will return the last value without removing it
    public int top() {
        return stack.peek();
    }
    
    // This method will give us the minimum value of the stack bby calling the second stack
    public int getMin() {
        return minStack.peek();
    }
}
