import java.util.Arrays;

public class prob1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if (k * m > bloomDay.length) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }
        int low = min;
        int high = max;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println(mid);
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }

    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int noOfB = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (day >= bloomDay[i]) {
                count++;
            } else {
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);
        if (noOfB >= m) {
            return true;
        } else {
            return false;
        }
    }

}
