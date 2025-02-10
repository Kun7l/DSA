package Recursion;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i != s.length()-1) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '}' && !stack.empty()) {
                if (stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (s.charAt(i) == ')' && !stack.empty()) {
                if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (s.charAt(i) == ']' && !stack.empty()) {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                return false;
            }
            i++;
        }

        if (!stack.empty()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidParenthesis v = new ValidParenthesis();
        System.out.println(v.isValid("("));
    }
}
