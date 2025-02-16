package Recursion;
public class Powxn {
    public double myPow(double x, int n) {
        long nn = n;
        if (nn < 0)
            nn = nn * -1;

        double ans = 1;

        while (nn > 0) {
            if (nn % 2 == 0) {
                x = x * x;
                nn = nn / 2;
            } else {
                ans = ans * x;
                nn--;
            }
        }
        if (n < 0)
            return (double) 1 /(double) ans;
        else
            return ans;
    }

    public static void main(String[] args) {
        Powxn p = new Powxn();
        System.out.println(p.myPow(2, -2000000));
    }
}
