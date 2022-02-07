// 最小栈 2022-02-07 13:47:48

//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计 
// 👍 1160 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    List<Integer> stack = new ArrayList<>();

    Integer min = Integer.MAX_VALUE;

    public MinStack() {

    }
    
    public void push(int val) {
        stack.add(val);

        min = Math.min(min, val);
    }
    
    public void pop() {
        int cur = top();
        stack.remove(stack.size() - 1);

        if(cur == min){
            refreshMin();
        }
    }
    
    public int top() {
       return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return min;
    }

    private void refreshMin(){
        min = Integer.MAX_VALUE;
        for (int i = 0; i < stack.size(); i++) {
            min = Math.min(min, stack.get(i));
        }

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
//leetcode submit region end(Prohibit modification and deletion)