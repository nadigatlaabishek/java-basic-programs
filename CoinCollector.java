public class CoinCollector {
    public static int maxCoins(int[] A) {
        int n = A.length;
        int[] dp = new int[n];
        dp[0] = A[0];
        dp[1] = Math.max(A[0], A[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + A[i]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] A = {2,1,2};
        System.out.println(maxCoins(A));
    }
}
