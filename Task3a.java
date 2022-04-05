// Refactoring
public class Task3a extends Problem1 {

    int[] dp; 

    public int helper(int index)
    {
        if (index >= arrAQI.length)
        {
            return 0;
        }

        if (dp[index] > 0)
        {
            return dp[index];
        }

        int curr = arrAQI[index];
        int sum = arrAQI[index] + helper(index+1);
        dp[index] = Math.max(curr, sum);
        return dp[index];
    }

    @Override
    public void solve() {
        dp = new int[nsize+1];
        int maxSumSoFar = Integer.MIN_VALUE, x = Integer.MIN_VALUE;
        int s = 0 , e = 0;

        for(int i = 0; i < nsize; i++){
            x = helper(i);
            if (x > maxSumSoFar)
            {
                maxSumSoFar = x;
                s = i;
            }
        }

        x = maxSumSoFar;
        e = s;

        while (x > 0)
        {
            x -= arrAQI[e];
            if (x == 0)
            {
                break;
            }
            e++;
        }

        sum = maxSumSoFar;
        l = s;
        r = e;
    }
}