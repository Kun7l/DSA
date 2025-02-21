import java.util.ArrayList;
import java.util.List;

public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findAll(finalAns, ans, 0, nums);
        return finalAns;
    }

    public void findAll(List<List<Integer>> finalAns, List<Integer> ans, int index, int[] nums) {
        if (index == nums.length) {
            finalAns.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[index]);
        findAll(finalAns, ans, index + 1, nums);
        ans.remove(ans.size() - 1);

        if (ans.isEmpty() || ans.get(ans.size() - 1) != nums[index]) {
            findAll(finalAns, ans, index + 1, nums);
        }
    }

    public static void main(String[] args) {
        SubsetII s = new SubsetII();
        int[] arr = {0,0,0};
        System.out.println(s.subsetsWithDup(arr));
    }
}
