public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
       int low = 0;
       int high = arr.length -1;
       int mid =0;
       int missing = 0;
       while (low<=high) {
        mid = (low+high)/2;
            missing = arr[mid] - (mid+1);

            if(missing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
       }
       return high+1+k;
    }
}
