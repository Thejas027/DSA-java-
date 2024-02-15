package Queues.Implementation;

import java.util.*;
public class QueueFrames {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();   // queue can be implemented using linked list or arraydequeue collections frame works only 
    q.add(10);
    q.add(20);
    q.add(30);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
