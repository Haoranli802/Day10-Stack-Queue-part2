class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else if(c == '(' || c == '[' || c == '{') stack.push(c);
            else return false;
        }
        return stack.size() == 0;
    }
}
