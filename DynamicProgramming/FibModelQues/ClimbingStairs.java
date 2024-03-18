package DynamicProgramming.FibModelQues;

/*
 * COUNT THE WAYS TO REACH nth STAIR . THE PERSON CAN CLIMB EITHER 1 OR 2 STAIRS AT A TIME 
 */
class CountClimbingStairs {

    // RECURSSION METHOD TO SLOVE THIS
    // TIME COMPLEX -- O(2^N)
    public int RecurssionWay(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        return (RecurssionWay(n - 1) + RecurssionWay(n - 2));
    }

    // using RECURSSION + MEMEOZIATION method
    // TIME COMPLEX -- O(N)
    public int RecMemoziation(int n, int dp[]) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (dp[n] != 0)
            return dp[n];

        dp[n] = RecMemoziation(n - 1, dp) + RecMemoziation(n - 2, dp);

        return dp[n];
    }

    // using TABULATION METHOD
    public int TabulationCount(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}

public class ClimbingStairs {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int n = 15;
        int dp[] = new int[n + 1];
        CountClimbingStairs count = new CountClimbingStairs();
        System.out.println("Number of ways of climbing " + n + " stairs : " + count.TabulationCount(n) + " ways");
    }
}
