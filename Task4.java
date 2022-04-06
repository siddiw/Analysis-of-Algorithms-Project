class Task4 extends Problem2 {
    public void solve() {
        int maxSumSoFar = Integer.MIN_VALUE;

        // r1 - x coordinate for top left
        for (int r1 = 0; r1 < msize; r1++) {
            // c1 - y coordinate for top left
            for (int c1 = 0; c1 < nsize; c1++) {
                // r2 - x coordinate for bottom right
                for (int r2 = r1; r2 < msize; r2++) {
                    // c2 - y coordinate for bottom right
                    for (int c2 = c1; c2 < nsize; c2++) {
                        // for each combination, calculate the sum
                        // of the submatrix.
                        int currSum = 0;
                        for (int m = r1; m <= r2; m++) {
                            for (int n = c1; n <= c2; n++) {
                                currSum += matAQI[m][n];
                            }
                        }

                        // Update if it is the max so far.
                        // Also update x1, y1, x2, y2
                        // if a new max is discovered.
                        if (maxSumSoFar < currSum) {
                            maxSumSoFar = currSum;
                            x1 = r1;
                            y1 = c1;
                            x2 = r2;
                            y2 = c2;
                        }
                    }
                }
            }
        }
        //setting the result
        sum = maxSumSoFar;
    }
}