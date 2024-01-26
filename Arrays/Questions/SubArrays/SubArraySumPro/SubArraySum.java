package SubArraySumPro;

public class SubArraySum {

    public static void subArSum(int num[]) {

        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {
                System.out.print("[ ");
                int Sum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(num[k] + " ");
                    Sum += num[k];
                    // System.out.println("Sum is : " + Sum);
                }

                System.out.println("]  -->And its Sum is : " + Sum);
                System.out.println();

                if (Sum < minSum) {
                    minSum = Sum;
                }
                if (Sum > maxSum) {
                    maxSum = Sum;
                }

            }
            System.out.println();
        }
        System.out.println("The max val in Sub-Array : " + maxSum);
        System.out.println("The min val in Sub-Array : " + minSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        subArSum(number);
    }
}
