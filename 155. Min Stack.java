public class MinStack {

    int min = Integer.MAX_VALUE;
    Stack <Integer> st;
    
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack <Integer>();
    }
    
    public void push(int x) {
        if(x<=min){ //if x=2, min = 3
            st.push(min);
            min = x; //record the second biggest
        }
        st.push(x);
    }
    
    public void pop() {
        if(st.pop()==min) min = st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
