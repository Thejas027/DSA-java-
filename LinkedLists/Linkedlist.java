
// package LinkedLists;

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
  public int count = 0;

  public void addFirst(int data) {
    Node newnNode = new Node(data);
    count++;
    if (head == null) {
      head = tail = newnNode;

      return;
    }
    newnNode.next = head;
    head = newnNode;

  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    count++;
    if (head == null) {
      head = tail = newNode;

      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void display() {

    Node current = head;
    if (current == null) {
      System.out.println("list is empty");
      return;
    }
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
    System.out.println("null");
  }

  public void addAtPos(int data, int pos) {
    if (pos < 0 || pos > count) {
      System.out.println("Invalid index\n");
      return;
    }

    int i = 0;
    if (pos == 0) {
      addFirst(data);
    } else if (pos == count) {
      addLast(data);
    } else {
      Node newNode = new Node(data);
      count++;
      Node current = head;
      while (i < pos - 1) {
        current = current.next;
        i++;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public int deleteAtfirst() {

    if (count == 0) {
      System.out.println("no element to delete list is empty");
      return -1;
    } else if (count == 1) {
      int val = head.data;
      head = tail = null;
      count--;
      return val;
    }
    Node current = head;
    int x = current.data;
    current = current.next;
    head = current;
    count--;
    return x;
  }

  public int deleteAtLast() {

    if (count == 0) {
      System.out.println("Linked list is empty");
      return -1;
    } else if (count == 1) {
      int x = head.data;
      head = tail = null;
      count--;
      return x;
    } else {
      Node prev = head;
      for (int i = 0; i < count - 2; i++) {
        prev = prev.next;
      }
      int x = tail.data;
      prev.next = null;
      tail = prev;
      count--;
      return x;
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
    System.out.println();
    System.out.println("The total number of nodes : " + ll.count);

    System.out.println("deleted element : " + ll.deleteAtfirst());

    System.out.println("deleted element : " + ll.deleteAtLast());
    System.out.println("deleted element : " + ll.deleteAtLast());
    System.out.print("linked list after deletion : ");
    ll.display();
  }

}