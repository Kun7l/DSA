
public class Leetcodecontest {
    public int countPartitions(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int leftsum = 0;
            int rightsum=0;
            for (int j = 0; j < i; j++) {
                leftsum += nums[i];
            }
            for (int k = i; k < nums.length; k++) {
                rightsum += nums[i];
            }

            if ((leftsum-rightsum)%2 == 0) {
                count++;
            }

        }
        return count;
    }
}
