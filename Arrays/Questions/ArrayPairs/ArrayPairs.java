package ArrayPairs;


class ArrayPairs {
  public static void printParis(int numbers[]) {
    int totalPairs = 0;
    for (int i = 0; i < numbers.length; i++) {
      int current = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print("(" + current + "," + numbers[j] + ")");
        totalPairs++;
      }
      System.out.println();
    }
    System.out.println("total pairs : " + totalPairs);
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    printParis(numbers);
  }
}