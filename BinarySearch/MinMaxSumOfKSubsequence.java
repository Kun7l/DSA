import java.util.ArrayList;
import java.util.List;

public class MinMaxSumOfKSubsequence {
    public int minMaxSums(int[] nums, int k) {
        int n = nums.length;
        int min = 0;
        int max = 0;
        int output = 0;
        int totalSubsequences = 1 << n; // Total 2^n subsequences

        for (int i = 0; i < totalSubsequences; i++) {
            ArrayList<Integer> subsequence = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if the j-th bit is set
                    subsequence.add(nums[j]);
                }
            }
            if (subsequence.size() <= k) { // Process only if size is <= k
                min = returnMin(subsequence);
                max = returnMax(subsequence);
                if(min>=0 && max >=0){
                    System.out.println(subsequence);
                output += (min+max);
                System.out.println(output);
                }
                
            }
        }
        return output;
    }
    
    public int returnMin(ArrayList<Integer> nums){
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.size();i++){
            min = Math.min(min,nums.get(i));
        }
        return min;
    }
    public int returnMax(ArrayList<Integer> nums){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.size();i++){
            max = Math.max(max,nums.get(i));
        }
        return max;
    }
   
}
