import java.util.Arrays;
import java.util.Stack;

public class DailyTempratures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1;i<temperatures.length;i++){
            while (!stack.empty() && temperatures[i]>temperatures[stack.peek()]) {
                answer[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        DailyTempratures d = new DailyTempratures();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(d.dailyTemperatures(temperatures)));
    }
}
