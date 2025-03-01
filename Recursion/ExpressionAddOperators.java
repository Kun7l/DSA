import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        generateAll(num, ans, num.charAt(0) + "", 0, target);
        return ans;
    }

    public void generateAll(String num, List<String> ans, String sol, int index, int target) {
        if (index == num.length() - 1) {
            if (evaluate(sol) == target) {
                ans.add(sol);
            }
            return;
        }
        sol += num.charAt(index + 1);
        System.out.println(sol);
        generateAll(num, ans, sol, index+1, target);
        sol = sol.substring(0, sol.length() - 1);

        sol += "*";
        sol+=num.charAt(index+1);
        generateAll(num, ans, sol, index+1, target);
        sol = sol.substring(0, sol.length()-1);
        sol = sol.substring(0, sol.length()-1);

        sol += "-";
        sol+=num.charAt(index+1);
        generateAll(num, ans, sol, index+1, target);
        sol = sol.substring(0, sol.length()-1);
        sol = sol.substring(0, sol.length()-1);

        sol += "+";
        sol+=num.charAt(index+1);
        generateAll(num, ans, sol, index+1, target);
        sol = sol.substring(0, sol.length()-1);
        sol = sol.substring(0, sol.length()-1);
    }

    public static int evaluate(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int num = 0;
        int sign = 1;
        char prevOp = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (!Character.isDigit(c) && c != ' ' || i == expression.length() - 1) {
                if (prevOp == '+') {
                    numbers.push(num);
                } else if (prevOp == '-') {
                    numbers.push(-num);
                } else if (prevOp == '*') {
                    numbers.push(numbers.pop() * num);
                }

                num = 0;
                prevOp = c;
            }
        }

        int result = 0;
        while (!numbers.isEmpty()) {
            result += numbers.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        ExpressionAddOperators e = new ExpressionAddOperators();
        System.out.println(e.addOperators("1008", 8));
    }
}
