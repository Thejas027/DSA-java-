package DynamicProgramming.FibModelQues;

public class DPfib {
    // MEMOIZATION WAY TO FIND THE FIB (a way in dynamic programmig to find the last
    // fib value and return it )
    // its a TOP DOWN APPROACH
    // TIME COMPLEXCIT -- O(N)
    public static int fib(int n, int f[]) {
        if (n == 0 || n == 1)
            return n;

        if (f[n] != 0)
            return f[n];

        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    // TABULATION METHOD TO FIND THE FIB (another most effecient than MEMOIZATION
    // way to find the last fib value and return it )
    // its a BOTTOM UP APPROACH
    // TIME COMPLEXCITY -- O(N)
    public static int fib2(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        if (n == 0 || n == 1)
            return n;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1];
        System.out.println(fib(n, f));
    }
}
