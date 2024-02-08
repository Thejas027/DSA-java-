
package LinkedLists;

public class Linkedlist {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  int count = 0;

  public void addFirst(int data) {
    Node newnNode = new Node(data);
    if (head == null) {
      head = tail = newnNode;
      count++;
      return;
    }
    newnNode.next = head;
    head = newnNode;
    count++;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      count++;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    count++;
  }

  public void display() {

    Node current = head;
    if (current == null) {
      System.out.println("list is empty");
      return;
    }
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
  }

  public void addAtPos(int data, int pos) {
    if (pos < 0 || pos > count) {
      System.out.println("Invalid index\n");
      return;
    }
    Node newNode = new Node(data);
    Node current = head;
    int i = 0;
    if (pos == 0) {
      addFirst(data);
    } else if (pos == count) {
      addLast(data);
    } else {
      while (i < pos - 1) {
        current = current.next;
        i++;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addFirst(10);
    ll.addFirst(5);
    ll.addLast(7);
    ll.addLast(12);
    ll.addAtPos(1234, 0);
    ll.addAtPos(999, 5);
    ll.addAtPos(30, 3);
    ll.display();
  }

}