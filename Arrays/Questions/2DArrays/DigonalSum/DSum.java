import java.util.Scanner;

public class DSum {

    // BRUTE FROCE METHOD TO CALCULATE THE DIGONAL SUM OF AN MATRIX -----> time
    // complexcity = O(n^2)
    public static int daginalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }

        }
        return sum;
    }

    // ANOTHER METHOD TO CALCULATE THE SUM OF AN DIGONAL MATRIX ----> time
    // complexcity = O(n)

    public static int dSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the row and col size of an matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter elements to 2d array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The digonal sum of an matrix : " + daginalSum(matrix));
        System.out.println("The Digonal sum is : " + dSum(matrix));
        sc.close();
    }
}
