
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

  public void addFirst(int data) {
    Node newnNode = new Node(data);
    if (head == null) {
      head = tail = newnNode;
      return;
    }
    newnNode.next = head;
    head = newnNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addFirst(1);
    ll.addLast(12);
  }

}