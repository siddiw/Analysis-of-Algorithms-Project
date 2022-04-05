import java.util.Vector;

public class Task6 extends Problem2 {

    static int task3b(Vector<Integer> subproblem) {
        int currSum = 0;
        int maxSumSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < (int) subproblem.size(); i++) {
            currSum += subproblem.get(i);

            if (currSum > maxSumSoFar) {
                maxSumSoFar = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSumSoFar;
    }

    public void solve() {
        int[][] prefix = new int[msize][];

        for (int i = 0; i < msize; i++) {

            prefix[i] = new int[nsize];
            for (int j = 0; j < nsize; j++) {
                prefix[i][j] = 0;
            }
        }

        for (int i = 0; i < msize; i++) {

            for (int j = 0; j < nsize; j++) {

                if (j == 0)
                    prefix[i][j] = matAQI[i][j];
                else
                    prefix[i][j] = matAQI[i][j]
                            + prefix[i][j - 1];
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nsize; i++) {
            for (int j = i; j < nsize; j++) {
                Vector<Integer> v = new Vector<Integer>();
                for (int k = 0; k < msize; k++) {
                    int el = 0;
                    if (i == 0)
                        el = prefix[k][j];
                    else
                        el = prefix[k][j]
                                - prefix[k][i - 1];

                    v.add(el);
                }
                // kadane - Task 3b
                maxSum = Math.max(maxSum, task3b(v));

                // int temp = task3b(v);

                // if (maxSum < temp){
                //     maxSum = temp;
                //     x1 = 
                // }
            }
        }

        sum = maxSum;
        //System.out.print(maxSum + "\n");
    }
}