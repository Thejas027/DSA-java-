// package Patterns.BasicPatterns;

import java.util.Scanner;

// fnx for pattern of floddy's triangle 
public class TrianglePatterns {
  static Scanner sc = new Scanner(System.in);

  public static void floddyTriangle() {
    System.out.print("Enter the n value : ");
    int n = sc.nextInt();
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  // 0-1 traingle
  public static void zeroOneTriangle() {
    System.out.print("enter n value : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0)
          System.out.print("1" + " ");
        else
          System.out.print("0" + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int choice;
    do {
      System.err.println("MENU");
      System.out.println("1.Floddy's Traiangle");
      System.out.println("2.Zero-One(0-1) Triangle");
      System.out.print("Enter your choice : ");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          floddyTriangle();
          break;
        case 2:
          zeroOneTriangle();
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (choice != 3);
  }
}