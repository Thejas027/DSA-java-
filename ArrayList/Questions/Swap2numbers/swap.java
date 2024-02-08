package ArrayList.Questions.Swap2numbers;


import java.util.ArrayList;

public class swap {

  public static void SwapOfNumber(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the index 1 value to swap : ");
    // int idx1 = sc.nextInt();
    // System.out.println("Enter the index 2 value to swap : ");
    // int idx2 = sc.nextInt();
    int idx1 = 1, idx2 = 3;
    System.out.print("list before swaping : " + list);
    SwapOfNumber(list, idx1, idx2);
    System.out.println();
    System.out.print("list after swaping : " + list);
    // sc.close();
  }
}
