import java.util.ArrayList;

public class MaxDepthOfNestedParanthesis {
    public int maxDepth(String s) {
        int tracker = 0;
        int MaxTracker = Integer.MIN_VALUE;
        int Stack = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Stack == 0) {
                MaxTracker = Math.max(MaxTracker, tracker);
            }
            if (s.charAt(i) == '(') {
                tracker++;
                Stack++;
            } else if (s.charAt(i) == ')') {
                Stack--;
                MaxTracker = Math.max(MaxTracker, tracker);
                tracker--;
            }

        }
        return MaxTracker;
    }
}
