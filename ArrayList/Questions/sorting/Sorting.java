package ArrayList.Questions.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(2);
    list.add(5);
    list.add(1);
    System.out.println("elements before sorting : " + list);
    Collections.sort(list);
    System.out.println("elements in ascending order : " + list);

    Collections.sort(list, Collections.reverseOrder());  // revrseOrder is a comparator for sorting 
    System.out.println("elements in descending order : " + list);
  }
}
