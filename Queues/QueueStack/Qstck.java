package Queues.QueueStack;

import java.util.Stack;

// implementation of queue using 2 stacks
// add--> time complex = O(n)  and remove and peek --> tome complex = O(1)

public class Qstck {

  static class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
      return s1.isEmpty();
    }

    public static void add(int data) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }

      s1.push(data);

      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
    }

    // remove function
    public static int remove() {
      if (s1.isEmpty()) {

        System.out.println("No element to pop");
        return -1;
      }
      return s1.pop();
    }

    public static int TopElement() {
      if (s1.isEmpty()) {
        System.out.println("No element in stack");
        return -1;
      }
      return s1.peek();
    }

    public static void display() {
      if (s1.isEmpty()) {
        System.out.println("No element to display");
        return;
      }
      System.out.print("Queue elements : ");
      while (!s1.isEmpty()) {
        System.out.print(s1.peek() + " ");

        s1.pop();
      }
    }

  }

  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(10);
    q.add(20);
    q.add(30);
    System.out.println("Removed element : " + q.remove());
    System.out.println("Top most element : " + q.TopElement());
    q.display();
  }
}