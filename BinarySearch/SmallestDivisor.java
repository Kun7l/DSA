public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int low = min;
        int high = max;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println(mid);
            if (sum(nums, mid) <= threshold) {
                ans = mid;
                break;
            } else {
                low = mid+1;
            }
        }
        return ans;

    }

    public int sum(int[] nums, int elem) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            
           
            ans += (int)Math.ceil((double)nums[i] / elem);
        }
        return ans;
    }
}
