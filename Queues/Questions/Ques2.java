package Queues.Questions;

// Inter leave 2 halfs of queue (EVEN LENGTH)
// EX : 1,2,3,4,5,6,7,8,9,10   --> input given   ---  here 1 to 5 is first halve and 6 to 10 is a second halve  
// 1,6,2,7,3,8,4,9,5,10  --> it should be the output of above input   --- inter leaved output 

import java.util.*;

public class Ques2 {

  public static void interLeave(Queue<Integer> q) {
    Queue<Integer> firstHalf = new LinkedList<>();
    int size = q.size();

    for (int i = 0; i < size / 2; i++) {
      firstHalf.add(q.remove());
    }
    while (!firstHalf.isEmpty()) {
      q.add(firstHalf.remove());
      q.add(q.remove());
    }

  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    // loop to add a int value to queue
    for (int i = 1; i <= 10; i++)
      q.add(i);

    interLeave(q);

    while (!q.isEmpty())
      System.out.print(q.remove() + " ");
  }
}
