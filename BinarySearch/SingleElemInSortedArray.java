
public class SingleElemInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int ans = 2;
        int low = 0;
        int high = nums.length-1;
        int mid =0;
        while (low<=high) {
            mid = (low+high)/2;
            if(mid==0){
                
                if(nums[mid] == nums[mid+1]){
                    low = mid+2;
                }
                else{
                    ans = nums[0];
                    break;
                }
            }
            if(mid == nums.length-1){
                if(nums[mid] == nums[mid-1]){
                    high = mid-2;
                }
                else{
                    ans = nums[nums.length-1];
                    break;
                }
            }
            if(nums[mid]==nums[mid-1]){
                if((mid-1)%2==0){
                    low = mid+1;
                }
                else{
                    high=mid-2;
                }
            }
            else if(nums[mid]==nums[mid+1]){
                if(((nums.length-1)-(mid+1))%2==0){
                   high = mid-1;
                }
                else{
                    low = mid+2;
                }
            }
            else if(nums[mid+1]!=nums[mid] && nums[mid]!=nums[mid-1]){
                ans = nums[mid];
                break;
            }
        }


        return ans;
    }
}
