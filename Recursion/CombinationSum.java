package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalAns = new ArrayList<>();
        findSum(candidates, target, finalAns, 0, new ArrayList<>());
        return finalAns;
    }

    public void findSum(int[] candidates, int target,
            List<List<Integer>> finalAns, int index, List<Integer> ans) {
        if (index == candidates.length) {
            if (target == 0) {
                finalAns.add(new ArrayList<>(ans));
                System.out.println(finalAns);
            }
            return;
        }

        if (candidates[index] <= target) {
            ans.add(candidates[index]);
            findSum(candidates, target - candidates[index], finalAns, index, ans);
            ans.remove(ans.size()-1);
        }
        findSum(candidates, target, finalAns, index+1, ans);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };

        CombinationSum c = new CombinationSum();
        System.out.println(
                c.combinationSum(arr, 7));
    }
}
