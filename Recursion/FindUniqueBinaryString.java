import java.util.*;

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        String sol = "";
        char[] candidates = { '0', '1' };
        int n = nums[0].length();
        finadAll(ans, sol, candidates, n);
        boolean isInside = false;
        for (int i = 0; i < ans.size(); i++) {
            isInside = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j].equals(ans.get(i))) {
                    isInside = true;
                    break;
                }
            }
            if (!isInside) {
                return ans.get(i);
            }
        }
        return "";
    }

    public void finadAll(ArrayList<String> ans, String sol, char[] candidates, int n) {
        if (sol.length() == n) {
            ans.add(sol);
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            sol += candidates[i];
            finadAll(ans, sol, candidates, n);
            sol = sol.substring(0, sol.length() - 1);
        }
    }

    public String optimal(String[] nums) {
        String sol = "";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(0) == '0') {
                sol += '1';
            } else {
                sol += '0';
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        FindUniqueBinaryString f = new FindUniqueBinaryString();
        String[] nums = { "00", "01" };
        System.out.println(f.findDifferentBinaryString(nums));
    }
}
