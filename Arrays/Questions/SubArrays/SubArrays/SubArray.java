package SubArrays;

public class SubArray {

    public static void subArray(int num[]) {
        int totalSubArray = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) { // only to print
                    System.out.print(num[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total sub array in an array is : " + totalSubArray);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        subArray(number);
    }
}
