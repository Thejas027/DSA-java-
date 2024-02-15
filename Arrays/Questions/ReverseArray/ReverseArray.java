package Arrays.Questions.ReverseArray;

import java.util.Scanner;

public class ReverseArray {

    public static void RArray(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("enter the elements to array : ");
        for (int i = 0; i < size; i++)
            number[i] = sc.nextInt();
        // int number[] = {1,2,3,4,5};
        RArray(number);
        System.out.print("The Reversed Array will be : ");
        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        sc.close();
    }
}
