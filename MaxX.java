import java.math.BigInteger;
import java.util.Arrays;

public class MaxX {
    public static final int MOD = 1000000007;

    public static int maxX(int[] A, int[] B, int n) {
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return maxXHelper(A, B, n - 1, n, dp);
    }

    public static int maxXHelper(int[] A, int[] B, int i, int j, int[][] dp) {
        if (j == 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int max = 0;
        for (int k = 0; k <= i; k++) {
            int y = (int)(((long)A[k] * j + (long)B[k] * (n - 1)) % MOD);
            max = Math.max(max, maxXHelper(A, B, k - 1, j - 1, dp) + y);
        }
        dp[i][j] = max;
        return max;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        int n = 3;
        System.out.println(maxX(A, B, n));
    }
}