package ArrayList.opeartions;

import java.util.ArrayList;

public class opration {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // to add element --> time complex = O(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);

    // to get element at particular index --> time complex = O(1)
    int element = list.get(3);
    System.out.println("element at pariticular index : " + element);

    // to overwrite the arraylist element value at index -->time comple = O(n)
    list.set(2, 30);
    System.out.println("list after resetting : " + list);

    // to delete the array list value --> time complex = O(n)
    int deleteEle = list.remove(2);
    System.out.println("deleted element : " + deleteEle);
    System.out.println("list after deletion of element : " + list);

    // contains elemet to check weather the element is present in list or not
    // returns bool type --> time complex = O(n)
    boolean ele = list.contains(177);
    if (ele) {
      System.out.println("element is in list ");
    } else {
      System.out.println("Element is not present");
    }

    // to know the size of an array list
    int size = list.size();
    System.out.println("size of an list " + size);
  }

}