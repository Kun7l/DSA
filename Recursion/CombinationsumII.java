import java.util.ArrayList;
import java.util.List;

public class CombinationsumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findAll(finalAns, ans, 0, candidates, target);
        return finalAns;
    }

    public void findAll(List<List<Integer>> finaAns, List<Integer> ans, int index, int[] candidates, int target) {
        if (index == candidates.length) {
            if (target == 0) {
                if (!finaAns.contains(ans)) {
                    finaAns.add(new ArrayList<>(ans));
                }
            }
            return;
        }

        if (candidates[index] <= target) {
           
                ans.add(candidates[index]);
                findAll(finaAns, ans, index + 1, candidates, target - candidates[index]);
                ans.remove(ans.size() - 1);
            
        }
        if (ans.isEmpty() || ans.get(ans.size()-1) != candidates[index]) {
            findAll(finaAns, ans, index + 1, candidates, target);
        }
       
    }

    public static void main(String[] args) {
        CombinationsumII c = new CombinationsumII();
        int[] candidates = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1 };
        System.out.println(c.combinationSum2(candidates, 30));
    }
}
