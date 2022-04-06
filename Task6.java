import java.util.Vector;

public class Task6 extends Problem2 {

    static int ll, rr, tt, bb;

    static int task3b(Vector<Integer> subproblem) {
        int currSum = 0, currStart = 0;
        int maxSumSoFar = Integer.MIN_VALUE;
        
        for (int currPtr = 0; currPtr < (int) subproblem.size(); currPtr++) {
            currSum += subproblem.get(currPtr);
            // Add current element to subarray sum
            if (maxSumSoFar < currSum) {
                //replace maximum
                maxSumSoFar = currSum;
                //updating coordinates
                ll = currStart;
                rr = currPtr;
            }

            //if sum falls below 0 then re-initialize it to zero
            if (currSum < 0) {
                currSum = 0;
                currStart = currPtr + 1;
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

        //calculating the prefix sum for every row
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
                        el = prefix[k][j] - prefix[k][i - 1];
                    v.add(el);
                }
                // kadane - Task 3b

                int temp = task3b(v);
                
                // update the overall sum and coordinates
                if (maxSum < temp) {
                    maxSum = temp;
                    tt = i;
                    bb = j;
                    x1 = ll;
                    x2 = rr;
                }
            }
        }

        y1 = tt;
        y2 = bb;

        //setting the result
        sum = maxSum;
    }
}