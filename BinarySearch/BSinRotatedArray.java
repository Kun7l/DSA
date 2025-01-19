
public class BSinRotatedArray {
    public int search(int[] nums, int target) {
       
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low<=high) {
            mid = (low+high)/2;
            if (nums[mid]==target) {
                return mid;
            }
            else if (nums[low]<=nums[mid]) {
                if (nums[low]<=target && target<=nums[mid]) {
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
