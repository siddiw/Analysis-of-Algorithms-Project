public class Task1 extends Problem1 {
    @Override
    public void solve() {
        int maxSumSoFar = Integer.MIN_VALUE;

        // left - left pointer
        for (int left = 0; left < nsize; left++) {
            // right - right pointer
            for (int right = left; right < nsize; right++) {
                int currSum = 0;
                for (int temp = left; temp <= right; temp++) {
                    currSum += arrAQI[temp];
                }

                // Update if it is the max so far.
                // Also update l and r
                // if a new max is discovered.
                if (maxSumSoFar < currSum) {
                    maxSumSoFar = currSum;
                    l = left;
                    r = right;
                }
            }
        }

        sum = maxSumSoFar;
    }
}
