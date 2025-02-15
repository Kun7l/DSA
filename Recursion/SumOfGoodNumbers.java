public class SumOfGoodNumbers {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 && i + k > nums.length - 1) {
                sum += nums[i];
            }
            else if (i-k<0) {
                if (nums[i]>nums[i+k]) {
                    sum += nums[i];
                }
            }
            else if (i+k>nums.length-1) {
                if (nums[i]>nums[i-k]) {
                    sum+=nums[i];
                }

            }
            else{
                if(nums[i]>nums[i-k] && nums[i]>nums[i+l]){
                    sum += nums[i];
                }
            }

        }
        return sum;
    }
}
