import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumSumWithatMostKElements {
    public long maxSum(int[][] grid, int[] limits, int k) {
            long ans = 0;
            ArrayList<Integer> ansArray = new ArrayList<>();

            for (int i = 0; i < grid.length; i++) {
                Arrays.sort(grid[i]);
                int count = grid[i].length-1;
                while (limits[i]!=0) {
                    ansArray.add(grid[i][count]);
                    limits[i] --;
                    count--;
                }
            }
            Collections.sort(ansArray);
            while (k!=0) {
            ans += ansArray.remove(ansArray.size()-1);
            k--;
            }
            return ans;
    }

    public static void main(String[] args) {
        MaximumSumWithatMostKElements m = new MaximumSumWithatMostKElements();
        int[][] grid = {{5,3,7},{8,2,6}};
        int[] limits = {0,3};

        System.out.println(m.maxSum(grid, limits, 2));
    }
}
