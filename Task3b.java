public class Task3b extends Problem1 {
    @Override
    public void solve() {
        int maxSumSoFar = 0;
        int currSum = 0, currStart = 0;

        for (int currPtr = 0; currPtr < nsize; currPtr++) {
            currSum += arrAQI[currPtr];

            if (maxSumSoFar < currSum) {
                maxSumSoFar = currSum;
                l = currStart;
                r = currPtr;
            }

            if (currSum < 0) {
                currSum = 0;
                currStart = currPtr + 1;
            }
        }

        sum = maxSumSoFar;
    }
}