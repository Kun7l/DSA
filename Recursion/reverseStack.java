package Recursion;

import java.util.Stack;

public class reverseStack {
    static void reverse(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int temp = s.pop();
        reverse(s);
        InsertInLast(s, temp);
    }

    static void InsertInLast(Stack<Integer> stack, int elem) {
        if (stack.size() == 0) {
            stack.push(elem);
        }
        else{
            int temp = stack.pop();
            InsertInLast(stack, elem);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        reverseStack r = new reverseStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        r.reverse(stack);
        System.out.println(stack);
    }
}
