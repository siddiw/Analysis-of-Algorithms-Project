public class Task1 extends Problem1 {
    @Override
    public void solve() {
        int maxSumSoFar = Integer.MIN_VALUE;

        // bruteforce for every combination of subarray.
        for (int left = 0; left < nsize; left++) {
            for (int right = left; right < nsize; right++) {
                int currSum = 0;
                for (int temp = left; temp <= right; temp++) {
                    //calculating the sum for subarray of range [left..right]
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

        //setting the result
        sum = maxSumSoFar;
    }
}
