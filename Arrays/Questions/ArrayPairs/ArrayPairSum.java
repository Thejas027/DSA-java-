package Arrays.Questions.ArrayPairs;

public class ArrayPairSum {

    public static void printParis(int numbers[]) {
        int totalPairs = 0;
        int pairsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                pairsum = numbers[i] + numbers[j];
                System.out.print("(" + current + "," + numbers[j] + ")");
                System.out.println("\nThe sum of each pair will be : " + pairsum);
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
