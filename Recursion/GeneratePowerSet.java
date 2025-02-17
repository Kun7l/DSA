package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GeneratePowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(nums));
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        generateAll(nums, 0, ans, sol);
        return ans;
    }

    public void generateAll(int[] nums, int pos, List<List<Integer>> ans, List<Integer> sol) {
        if (pos == nums.length) {
            ans.add(new ArrayList<>(sol));
            return;
        }
        generateAll(nums, pos + 1, ans, sol);
        sol.add(nums[pos]);
        generateAll(nums, pos + 1, ans, sol);
        sol.remove(sol.size() - 1);
    }
    public static void main(String[] args) {
        GeneratePowerSet g = new GeneratePowerSet();
        
        int[] arr = {1,2,2};
        System.out.println(g.subsets(arr));
    }
}
