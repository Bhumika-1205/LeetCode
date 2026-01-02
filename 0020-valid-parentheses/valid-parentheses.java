class Solution {
    public boolean isValid(String s) {
        char ch;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else {
                 if (stack.isEmpty()){
                    return false;
                }
                char a=stack.peek();
                if ((ch==')' && a!='(') || (ch=='}' && a!='{') || (ch==']' && a!='[')){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
