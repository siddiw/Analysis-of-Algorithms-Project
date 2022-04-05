public class Task2 extends Problem1 {
    @Override
    public void solve() {
        int maxSumSoFar = Integer.MIN_VALUE;
        int temp = 0;
        int[] dp = new int[nsize + 1];

        dp[0] = 0;

        for (int i = 1; i <= nsize; i++) {
            dp[i] = dp[i - 1] + arrAQI[i - 1];
        }

        for (int left = 1; left <= nsize; left++) {
            for (int right = left; right <= nsize; right++) {
                temp = dp[right] - dp[left - 1];
                if (temp > maxSumSoFar) {
                    maxSumSoFar = temp;
                    l = left - 1;
                    r = right - 1;
                }
            }
        }
        sum = maxSumSoFar;
    }
}