package Queues.StackQueues;

import java.util.*;

public class StckQueue {

  static class Stack {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static boolean isEmpty() {
      return q1.isEmpty() && q2.isEmpty();
    }

    public static void push(int value) {
      if (!q1.isEmpty()) {
        q1.add(value);
      } else {
        q2.add(value);
      }
    }

  }

        public static void main(String[] args) {

  }
}
