public class Task5 extends Problem2 {
    public void solve() {

        int[][] sub = new int[msize + 1][nsize + 1];

        for (int r1 = 0; r1 <= msize; r1++) {
            for (int r2 = 0; r2 <= nsize; r2++) {
                if (r1 == 0 || r2 == 0) {
                    sub[r1][r2] = 0;
                } else {
                    sub[r1][r2] = sub[r1 - 1][r2] + sub[r1][r2 - 1] - sub[r1 - 1][r2 - 1] +
                            matAQI[r1 - 1][r2 - 1];
                }
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int r1 = 0; r1 < msize; r1++) {
            for (int r2 = r1; r2 < msize; r2++) {
                for (int c1 = 0; c1 < nsize; c1++) {
                    for (int c2 = c1; c2 < nsize; c2++) {
                        int submatrix_sum = sub[r2 + 1][c2 + 1] - sub[r2 + 1][c1]
                                - sub[r1][c2 + 1] + sub[r1][c1];

                        if (submatrix_sum > maxSum) {
                            maxSum = submatrix_sum;
                            x1 = r1;
                            x2 = r2;
                            y1 = c1;
                            y2 = c2;
                        }
                    }
                }
            }
        }

        sum = maxSum;
    }
}