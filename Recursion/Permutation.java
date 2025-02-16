import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        findAllPermutaions(finalAns, ans, 0, s);
        return finalAns;
    }

    public void findAllPermutaions(List<List<Integer>> finalAns, List<Integer> ans, int index, String s) {
        if (s.length() == 1) {
            ans.add(Integer.valueOf(s.charAt(index)));
            finalAns.add(ans);
            return;
        }

        ans.add(Integer.valueOf(s.charAt(index)));
        findAllPermutaions(finalAns, ans, index, s.substring(index+1, s.length()));
        ans.remove(ans.size()-1);

        ans.add(Integer.valueOf(s.charAt(index+1)));
        findAllPermutaions(finalAns, ans, index+1, s.substring(index+1, s.length()));
        ans.remove(ans.size()-1);
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
        int[] arr = { 1, 2, 3 };
        System.out.println(p.permute(arr));
    }
}
