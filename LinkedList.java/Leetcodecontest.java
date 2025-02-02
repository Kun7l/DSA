import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Leetcodecontest {
    public int minimumIncrements(int[] nums, int[] target) {
        int targetGcd = target[0];
        for (int i = 1; i < target.length; i++) {
            targetGcd = gcd(targetGcd,target[i]);
        }

        int operations = 0;
        int leastDiffIndex = 0;

        for (int num : nums) {
            if (targetGcd) {
                
            }
        }
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
