package SubArraySumPro;
// best way to get the max val of an sub array and min val of an sub array with lesset time complexcity

public class PrefixSum {

    public static void subArSum(int num[]) {
        int Sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefixSum[] = new int[num.length];
        prefixSum[0] = num[0];

        for (int i = 1; i < prefixSum.length; i++)
            prefixSum[i] = prefixSum[i - 1] + num[i];

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                Sum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];

                if (Sum < minSum) {
                    minSum = Sum;
                }
                if (Sum > maxSum) {
                    maxSum = Sum;
                }

            }
        }
        System.out.println("The max val in Sub-Array : " + maxSum);
        System.out.println("The min val in Sub-Array : " + minSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArSum(numbers);
    }
}
