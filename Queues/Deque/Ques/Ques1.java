package Queues.Deque.Ques;

import java.util.Deque;
import java.util.LinkedList;

/*
 * program uses deque to implement the stack and queue operations where tiem complexcity is O(1);
 * FOR STACK OPERATIONS addLast to push,reamoveLast to pop and getLast to peek the top most element ---> these dequeu operations are used
 * 
 */

public class Ques1 {

  static class stack {
    Deque<Integer> deque = new LinkedList<>();

    // push operation usind deque
    public void push(int data) {
      deque.addLast(data);
    }

    // pop operation using deque
    public int pop() {
      return deque.removeLast();
    }

    // peek operation usind dequeu
    public int peek() {
      return deque.getLast();
    }
  }

  public static void main(String[] args) {

  }
}
