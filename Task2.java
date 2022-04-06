public class Task2 extends Problem1 {
    @Override
    public void solve() {
        int maxSumSoFar = Integer.MIN_VALUE;
        int temp = 0;
        int[] dp = new int[nsize + 1];

        dp[0] = 0;

        //Calculating the prefixes i.e dp[i] sum of the subarray until the ith index
        for (int i = 1; i <= nsize; i++) {
            dp[i] = dp[i - 1] + arrAQI[i - 1];
        }
        //traversing through every pair of elements in a prefix array
        for (int left = 1; left <= nsize; left++) {
            for (int right = left; right <= nsize; right++) {
                //calculating subarray sum for range [left..right]
                temp = dp[right] - dp[left - 1];
                if (temp > maxSumSoFar) {
                    //replacing the maximum maintained
                    maxSumSoFar = temp;
                    //updating the coordinates
                    l = left - 1;
                    r = right - 1;
                }
            }
        }

        //setting the result
        sum = maxSumSoFar;
    }
}