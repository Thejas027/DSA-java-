package Arrays.Questions.MinCommonValue;

// LEET CODE DAILY CHANLLAGE OF DAY 9/3/2024 
// to return the min value in a given two sorted array (the min element should be present in both the arrays)

public class min {

    public static int getCommon(int num1[], int num2[]) {
        int min1 = 0;
        int min2 = 0;

        while (min1 < num1.length && min2 < num2.length) {
            if (num1[min1] < num2[min2]) {
                min1++;
            } else if (num1[min1] > num2[min2]) {
                min2++;
            } else {
                return num1[min1];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int num1[] = { 6, 11, 14 };
        int num2[] = { 1, 2, 6 };

        System.out.println(getCommon(num1, num2));
    }

}
