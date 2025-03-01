
public class march1 {
    public int[] applyOperations(int[] nums) {
        int[] d = new int[nums.length];
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                d[k++] = nums[i];
            }
        }
        return d;
    }
}
