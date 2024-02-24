package Patterns.BasicPatterns;

// simple pattern program to print half pyramid pattern

public class HalfPyramid {
  public static void main(String[] agrs) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
