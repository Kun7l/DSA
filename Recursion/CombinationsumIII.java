import java.util.ArrayList;
import java.util.List;

public class CombinationsumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findAll(finalAns, ans, k, n, 1);
        return finalAns;
    }

    public void findAll(List<List<Integer>> finalAns, List<Integer> ans, int k, int target, int index) {

        if (ans.size() == k) {
            System.out.println(ans);
            if (target == 0) {
                finalAns.add(new ArrayList<>(ans));
            }
            return;
        }
        if (index > 9) {
            return;
        }

        if (index <= target) {
            ans.add(index);
            findAll(finalAns, ans, k, target - index, index + 1);
            ans.remove(ans.size() - 1);

            findAll(finalAns, ans, k, target, index + 1);
        }

    }

    public static void main(String[] args) {
        CombinationsumIII c = new CombinationsumIII();
        System.out.println(c.combinationSum3(9, 45));
    }
}
