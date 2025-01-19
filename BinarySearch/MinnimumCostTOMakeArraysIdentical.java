import java.util.Arrays;

public class MinnimumCostTOMakeArraysIdentical {
    public long minCost(int[] arr, int[] brr, int k) {
        
        
    int n = arr.length;
        // Step 1: Sort both arrays to align elements optimally
        Arrays.sort(arr);
        Arrays.sort(brr);

        // Step 2: Dynamic Programming table to calculate costs
        // dp[i][j] = minimum cost to make first i elements of arr equal to first j elements of brr
        int[][] dp = new int[n + 1][n + 1];

        // Initialize the DP array
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = 0; // No cost for 0 elements

        // Step 3: Populate the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i < n && j < n) {
                    // Option 1: Adjust the current element without splitting
                    dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1],
                            dp[i][j] + Math.abs(arr[i] - brr[j]));
                }
                if (i < n) {
                    // Option 2: Split at the current position
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + k);
                }
            }
        }

        // Step 4: The final answer is dp[n][n]
        return (long)dp[n][n];
    }

}
