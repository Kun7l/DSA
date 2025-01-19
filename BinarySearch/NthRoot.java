public class NthRoot {
    public int nthRoot(int n, int m) {
        int low =1;
        int high = m;
        int mid = 0;
        int insideCount = 1;
        while (low<=high) {
            insideCount = 1;
            mid = (low+high)/2;
            for(int i = 1;i<=n;i++){
                insideCount = insideCount * mid;
            }
            System.out.println(insideCount);
            if(insideCount == m){
                return mid;
            }
            else if(insideCount>m){
                high = mid-1;
            } 
            else{
                low = mid+1;
            }
        }
        return -1;

    }
}
