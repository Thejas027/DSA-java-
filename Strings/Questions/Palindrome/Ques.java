package Strings.Questions.Palindrome;

public class Ques {

  public static boolean palindrome(String str) {
    int length = str.length();
    for (int i = 0; i < length / 2; i++) {
      if (str.charAt(i) != str.charAt(length - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "racecar";
    if (palindrome(str))
      System.out.println(str + " is a palindrome");
    else
      System.out.println(str + " is not a palindrome");

  }
}
