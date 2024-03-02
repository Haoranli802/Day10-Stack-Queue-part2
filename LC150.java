class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")) stack.push(stack.pop() + stack.pop());
            else if(s.equals("-")) stack.push(-stack.pop() + stack.pop());
            else if(s.equals("*")) stack.push(stack.pop() * stack.pop());
            else if(s.equals("/")){
                int left = stack.pop();
                int right = stack.pop();
                stack.push(right / left);
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
//O(N), O(N)
