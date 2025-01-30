import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            int ans = 0;
            while (n!=0) {
                ans += Math.pow((n%10), 2);
                n = n/10;
            }
            n = ans;
            if (n==1) {
                return true;
            }
        }
        return false;
        
    }
}
