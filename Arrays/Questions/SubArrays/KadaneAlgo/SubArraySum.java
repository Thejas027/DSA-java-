package Arrays.Questions.SubArrays.KadaneAlgo;

public class SubArraySum {

  public static void subArSum(int num[]) {
    int ms = Integer.MIN_VALUE;  // maximum sum
    int cs = 0;                  // current sum
    for (int i = 0; i < num.length; i++) {
      cs = cs + num[i];
      if (cs < 0) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }
    System.out.println("Max val of an subarray : " + ms);
  }

  public static void main(String[] args) {
    int number[] = { 2, 4, 6, 8, 10 };
    subArSum(number);
  }
}
