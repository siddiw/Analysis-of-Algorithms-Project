public class Task3b extends Problem1 {
    @Override
    public void solve() {
        int maxSumSoFar = Integer.MIN_VALUE;
        int currSum = 0, currStart = 0;

        for (int currPtr = 0; currPtr < nsize; currPtr++) {
            //maintaining current subarray sum
            currSum += arrAQI[currPtr];

            if (maxSumSoFar < currSum) {
                //replacing the maximum maintained
                maxSumSoFar = currSum;
                //updating the coordinates
                l = currStart;
                r = currPtr;
            }

            //initializing it to zero if the sum tracked goes into negative
            if (currSum < 0) {
                currSum = 0;
                currStart = currPtr + 1;
            }
        }
        //writing it to result
        sum = maxSumSoFar;
    }
}