public class Task3a extends Problem1 {

    int[] dp = new int[nsize];


    // public int helper(int index, )
    // {
    //     // if (idx >= arrAQI.size())
    //     // {
    //     //     return 0;
    //     // }
    //     // if (dp.count(idx))
    //     // {
    //     //     return dp[idx];
    //     // }
    //     // int curr = arrAQI[idx];
    //     // int sum = arrAQI[idx] + solve(arrAQI, idx + 1, dp);
    //     // return dp[idx] = max(curr, sum);
    // }


    @Override
    public void solve() {

    }

    // 
    // int solve(vector<int> &arrAQI, int idx, unordered_map<int, int> &dp)
    // {
    //     if (idx >= arrAQI.size())
    //     {
    //         return 0;
    //     }
    //     if (dp.count(idx))
    //     {
    //         return dp[idx];
    //     }
    //     int curr = arrAQI[idx];
    //     int sum = arrAQI[idx] + solve(arrAQI, idx + 1, dp);
    //     return dp[idx] = max(curr, sum);
    // }
    // void task3a(vector<int> arrAQI, int n, unordered_map<int, int> &dp)
    // {
    //     int maxSumSoFar = INT_MIN, x = INT_MIN;
    //     int start = 0;
    //     int end = 0;

    //     for (int i = 0; i < n; i++)
    //     {
    //         x = solve(arrAQI, i, dp);
    //         if (x > maxSumSoFar)
    //         {
    //             maxSumSoFar = x;
    //             start = i;
    //         }
    //     }

    //     x = maxSumSoFar;

    //     end = start;

    //     while (x)
    //     {
    //         x -= arrAQI[end];
    //         if (x == 0)
    //         {
    //             break;
    //         }
    //         end++;
    //     }

    //     start++;
    //     end++;
    //     cout << start << " " << end << " " << maxSumSoFar;
    // }
    //
}