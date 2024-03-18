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
}

public class KnapSack {
    public static void main(String[] args) {
        int val[] = { 15, 14, 15, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        KnapSack01 ks = new KnapSack01();
        System.out.println(ks.RecurrsionMeth(val, wt, W, val.length));
    }
}
