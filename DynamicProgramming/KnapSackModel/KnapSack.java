package DynamicProgramming.KnapSackModel;

class KnapSack01 {

    // RECURSSION METHOD
    public int RecurrsionMeth(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0)
            return 0;

        if (wt[n - 1] <= W) { // valid condition
            int ans1 = val[n - 1] + RecurrsionMeth(val, wt, W - wt[n - 1], n - 1); // included to bag

            int ans2 = RecurrsionMeth(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        } else
            return RecurrsionMeth(val, wt, W, n - 1);
    }

    // MEMOZIATION METHOD
    public int MemoziaationRec(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];

        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + MemoziaationRec(val, wt, W - wt[n - 1], n - 1, dp);

            int ans2 = MemoziaationRec(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = MemoziaationRec(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // TABULATION METHOS
    public int TabulationRec(int val[], int wt[], int W, int n) {
        int dp[][] = new int[val.length + 1][W + 1];
        if (W == 0 || n == 0)
            return 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (wt[n - 1] <= j) {
                    int p1 = val[i - 1] + dp[i - 1][j - wt[n - 1]];

                    int p2 = dp[i - 1][j - wt[n - 1]];

                    dp[n][W] = Math.max(p1, p2);
                    return dp[n][W];
                } else {
                    dp[n][W] = TabulationRec(val, wt, W - wt[n - 1], n - 1);
                    return dp[n][W];
                }
            }
        }
        return n;
    }
}

public class KnapSack {
    public static void main(String[] args) {
        int val[] = { 15, 14, 15, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;
        }
        KnapSack01 ks = new KnapSack01();
        System.out.println(ks.MemoziaationRec(val, wt, W, val.length, dp));
    }
}
