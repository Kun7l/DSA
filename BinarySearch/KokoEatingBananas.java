import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = countMax(piles);
        int mid = 0;
        int totalHours = 0;
        while (low<=high) {
            
            mid = (low+high)/2;
            totalHours = countHours(piles, mid);

            
            if(totalHours==h){
                return mid;
            }
            else if (totalHours<h) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public int countMax(int[] piles){
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    public int countHours(int[] piles, int elem){
        int countedHours=0;
        for (int i = 0; i < piles.length; i++) {
            countedHours += Math.ceil((double)(piles[i]) / (double)(elem));
            
        }
        return countedHours;
    }
}

