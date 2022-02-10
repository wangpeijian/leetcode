// 栈的最小值 2022-02-10 17:44:34

//请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(
//1)。 示例： MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
// minStack.push(-3); minStack.getMin();   --> 返回 -3. minStack.pop(); minStack.top
//();      --> 返回 0. minStack.getMin();   --> 返回 -2. Related Topics 栈 设计 
// 👍 65 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    List<Integer> stack = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {

    }
    
    public void push(int x) {
        stack.add(x);
        min = Math.min(x, min);
    }
    
    public void pop() {
        int c = stack.get(stack.size() - 1);

        stack.remove(stack.size() - 1);

        if(c == min){
            min = Integer.MAX_VALUE;
            updateMin();
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return min;
    }

    private void updateMin(){
        for(int x : stack){
            min = Math.min(x, min);
        }
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
//leetcode submit region end(Prohibit modification and deletion)
