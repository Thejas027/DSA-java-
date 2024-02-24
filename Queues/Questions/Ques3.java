// package Queues.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// queue reversal using stacks

public class Ques3 {

  public static void queueReversal(Queue<Integer> q) {
    Stack<Integer> st = new Stack<>();

    // element from q is removed and added to stack
    while (!q.isEmpty())
      st.push(q.remove());

    // element from stack is poped out and added to queue where a queue elements are
    // reversed
    while (!st.isEmpty())
      q.add(st.pop());
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    // loop to take an input for queue
    for (int i = 1; i <= 5; i++)
      q.add(i);

    queueReversal(q);

    while (!q.isEmpty())
      System.out.print(q.remove() + " ");

    System.out.println();
  }
}
