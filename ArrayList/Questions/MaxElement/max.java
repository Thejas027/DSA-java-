package ArrayList.Questions.MaxElement;

import java.util.ArrayList;

public class max {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(9);
    list.add(6);
    list.add(3);

    // time complex = O(n)

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
      if (max < list.get(i)) {
        max = list.get(i); // or max = Math.max(max,list.get(i));
      }
    }
    System.out.println("The max element : " + max);
  }
}
