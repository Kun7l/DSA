import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public String smallestNumber(String pattern) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        char count = '1';
        stack.add(count);
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'I') {
                while (!stack.empty()) {
                    ans += stack.pop();
                }
                count++;
                stack.push(count);
            } else {
                count++;
                stack.push(count);
            }
        }
        if (!stack.empty()) {
            while (!stack.empty()) {
                ans += stack.pop();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ConstructSmallestNumberFromDIString c = new ConstructSmallestNumberFromDIString();
        System.out.println(c.smallestNumber("IIIDII"));
    }
}
