public class ShipPackagesInDdays {
    public int shipWithinDays(int[] weights, int days) {
    
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max,weights[i]);
            sum += weights[i];
        }

        int low = max;
        int high = sum;
        int mid = 0;
        while (low<=high) {
            mid = (low+high)/2;
            if (countDays(weights, mid)<=days) {
                high=mid-1;
            }
            else{
                low = mid+1;;
            }
        }
        return low;

    }
    public int countDays(int[] weights,int capacity){
        int days = 1;
        int count = 0;
        for (int j = 0; j < weights.length; j++) {
            
            if(count + weights[j]>capacity){
                days++;
                count=weights[j];
            }
            else{
                count+=weights[j];
            }

        }
        return days;
    }
}
