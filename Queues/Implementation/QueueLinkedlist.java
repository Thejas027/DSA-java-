// package Queues.Implementation;

public class QueueLinkedlist {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class CustomLinkedlist {
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
      return head == null & tail == null;
    }

    public void add(int value) {
      Node newnode = new Node(value);
      if (isEmpty()) {
        head = tail = newnode;
        return;
      }
      tail.next = newnode;
      tail = newnode;
    }

    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      int value = head.data;
      if (tail == head) {
        tail = head = null;
      } else {
        head = head.next;
      }
      return value;
    }

    public static int TopMostElement() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return head.data;
    }
  }

  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    CustomLinkedlist q = new CustomLinkedlist();
    q.add(10);
    q.add(20);
    q.add(30);
    while (!q.isEmpty()) {
      System.out.println(q.TopMostElement());
      q.remove();
    }
  }
}
