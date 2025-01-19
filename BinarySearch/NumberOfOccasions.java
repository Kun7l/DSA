
public class NumberOfOccasions {
    int countFreq(int[] arr, int target) {
        
        int low = 0;
        int high = arr.length -1;
        int mid = 0;
        int ans = 0;
        while (low<=high) {
            mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
        }
        target = target +1;
        int ans2 = arr.length;
        low = 0;
        high = arr.length-1;
        while (low<=high) {
            mid = (low+high)/2;
            if(arr[mid]>=target){
                ans2 = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
        }
        System.out.println(ans2);
        System.out.println(ans);
        return ans2-ans;
    }
}
