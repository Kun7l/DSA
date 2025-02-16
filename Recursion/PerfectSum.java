package Recursion;

public class PerfectSum {
    public int perfectSum(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        int sumNum = sum(nums);
        if (sumNum == target) {
            count++;
        }
        return count;
    }

    public int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
