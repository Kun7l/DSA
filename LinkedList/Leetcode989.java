import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode989 {
    public static List<Integer> main(String[] args) {
        int[] a = {1,2,3,4};
        int k = 34;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        for (int i = a.length-1; i >= 0; i--) {
            int sum = (a[i]+k%10)+carry;
            carry = sum/10;
            k = k/10;
            ans.add(sum%10);
        }
        if (carry != 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}
