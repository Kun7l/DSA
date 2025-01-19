
public class MinInSorted {
    public int findMin(int[] arr) {
        int min = 0;
        int low = 0;
        int high = arr.length -1;
        int mid =0;

        while (low<=high) {
            mid = (low+high)/2;

            if (arr[low]<=arr[mid]) {
                if(arr[min]>arr[low]){
                    min = low;
                }
                low = mid+1;
            }
            else if (arr[mid]<=arr[high]) {
                if(arr[min]>arr[mid]){
                    min = mid;
                }
                high = mid-1;
            }
        }

        return min;
    }
}
