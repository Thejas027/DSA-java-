package LinkeList;

public class StackLinkedlist {
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class CustomStack {
    static Node head = null;

    public static boolean isEmpty() {
      return head == null;
    }

    public static void push(int data) {
      Node newNode = new Node(data);
      if (isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public static int pop() {
      if (isEmpty()) {
        System.out.println("Stack is empty!");
        return -1;
      }
      int value = head.data;
      head = head.next;
      return value;
    }

    public static int peek() {
      if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
      }
      return head.data;
    }

  }

  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    CustomStack stack = new CustomStack();
    stack.push(10);
    stack.push(20);
    System.out.println(stack);
  }
}
