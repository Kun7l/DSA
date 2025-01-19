public class FloorOrRoot {
    int floorSqrt(int n) {
        int ans = 1;
        int low = 1;
        int high = n;
        int mid = 0;
        while (low<=high) {
            mid = (low+high)/2;
            if(mid*mid <= n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            } 
        }
        return ans;
    }
}
