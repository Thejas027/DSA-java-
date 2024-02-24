package Patterns.BasicPatterns;

/*
 * MENU DRIVEN PROGARAM OF SOME "VARIOUS-PYRAMIDS PATTERNS"
 * 1.HALF PYRAMID
 * 2.INVERTED HALF PYRAMID
 * 3.HALF PYRAMID WITH 180 deg ROTATION
 * 4.HALF PYRAMID WITH NUMBERS
 * 5.INVERTED HALF PYRAMID WITH NUMBERS
 */

import java.util.Scanner;

public class HalfPyramid {
  static Scanner sc = new Scanner(System.in);

  // fnx which gives the pattern of simple half pyramid.
  public static void halfPyramid() {

    System.out.print("enter the n value : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  // fnx which gives the pattern of inverted half pyramid
  public static void invertedPyramid() {

    System.out.print("enter the n value : ");
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  // fnx for half pyramid with rotation of 180 deg

  public static void rotatedPyramid() {
    System.out.print("enter the n value : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // fnx for half pyramid with numbers

  public static void numPyramid() {
    System.out.print("enter the n value : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(j + " ");
      System.out.println();
    }
  }

  // fnx for inverted half pyramid with numbers

  public static void invertedNumPy() {
    System.out.print("enter the n value : ");
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++)
        System.out.print(j + " ");
      System.out.println();
    }
  }

  public static void main(String[] agrs) {

    int choice;
    do {
      System.err.println("\n----MENU----\n");
      System.out.println("1.Half Pyramid");
      System.out.println("2.Inverted half Pyramid");
      System.out.println("3.Half pyramid with 180 deg rotation");
      System.out.println("4.Half pyramid with numbers");
      System.out.println("5.Inverted half pyramid with numbers");
      System.out.println("Enter your choice");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          halfPyramid();
          break;

        case 2:
          invertedPyramid();
          break;
        case 3:
          rotatedPyramid();
          break;

        case 4:
          numPyramid();
          break;
        case 5:
          invertedNumPy();
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }

    } while (choice != 6);
  }

}
