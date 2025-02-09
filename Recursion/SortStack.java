package Recursion;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        int n = s.size();
        int[] a = new int[n];

        int i = 0;
        while (!s.empty()) {
            a[i] = s.pop();
            i++;
        }

        Arrays.sort(a);
        i = 0;
        while (i != n) {
            s.push(a[i]);
            i++;
        }
        return s;
    }

    public Stack<Integer> recursive(Stack<Integer> s) {
        if (!s.empty()) {
            int temp = s.pop();
            recursive(s);
            InsertInStack(s, temp);
        }

        return s;
    }

    public void InsertInStack(Stack<Integer> stack, int elem) {
        if (stack.size() == 0 || stack.peek() <= elem) {
            stack.push(elem);
        } else {
            int temp = stack.pop();
            InsertInStack(stack, elem);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        SortStack s = new SortStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(32);
        stack.push(43);
        stack.push(11);
        stack.push(7);

        System.out.println(s.recursive(stack));
    }
}
