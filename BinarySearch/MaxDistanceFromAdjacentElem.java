public class MaxDistanceFromAdjacentElem {
    public int maxAdjacentDistance(int[] nums) {

        int di = 0;
        int maxDi = 0;
        for(int i = 0; i<nums.length;i++){
            if (i==0) {
                maxDi = Math.max(maxDi, (int)Math.abs(nums[i]-nums[i+1]));
            }
            else if (i==nums.length-1) {
                maxDi = Math.max(maxDi, (int)Math.abs(nums[i]-nums[0]));
            }
            else{
                di = Math.abs(nums[i-1] - nums[i]);
           maxDi = Math.max(maxDi, di);
           di = Math.abs(nums[i+1]-nums[i]);
           maxDi = Math.max(maxDi, di);
            }
            
        }
        return maxDi;
    }
}
