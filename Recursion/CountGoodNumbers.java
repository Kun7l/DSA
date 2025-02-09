package Recursion;

public class CountGoodNumbers {
    public int countGoodNumbers(long n) {
        int ans = 0;
        if (n == 1) {
            return 5;
        } else {
            if (n % 2 != 0) {
                ans = ans * 4;
            } else {
                ans = ans * 5;
            }
        }
        return ans * countGoodNumbers(n-1);
    }
}
