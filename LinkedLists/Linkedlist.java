
 package LinkedLists;

import java.util.Scanner;

public class Linkedlist {

  private static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private static Node head;
  private static Node tail;
  private int count = 0;

  public boolean isEmpty() {
    return head == null;
  }

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

  public void addPosition(int data, int pos) {
    Node newNode = new Node(data);
    Node current = head;
    count++;
    for (int i = 0; i < pos; i++) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = null;
  }

  public void addAtPos(int data, int pos) {
    if (pos < 0 || pos > count) {
      System.out.println("Invalid index\n");
      return;
    }
    if (pos == 0) {
      addFirst(data);
    } else if (pos == count) {
      addLast(data);
    } else {
      addPosition(data, pos);
    }
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

  public int deleteAtPos(int pos) {
    if (pos < 0 || pos > count) {
      System.out.println("invalid index . cannot be deleted");
      return -1;
    } else if (pos == 0) {
      return deleteAtfirst();
    } else if (pos == count) {
      return deleteAtLast();
    }
    Node current = head.next;
    Node prev = head;
    for (int i = 1; i < pos; i++) {
      prev = current;
      current = current.next;
    }
    int x = current.data;
    prev.next = current.next;
    count--;
    return x;

  }

  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    // ll.addFirst(1);
    // ll.addAtPos(10, 1);
    // ll.addAtPos(20, 2);
    // ll.addLast(30);
    // ll.display();
    // System.out.println();
    // System.out.println("The total number of nodes : " + ll.count);

    // System.out.println("deleted element : " + ll.deleteAtPos(0));
    // System.out.print("linked list after deletion : ");
    // ll.display();

    int choice, value, pos;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("MENU");
      System.out.println("1.ADD ELEMENT AT FIRST");
      System.out.println("2.ADD ELEMENT AT LAST");
      System.out.println("3.ADD ELEMENT AT POSITON");
      System.out.println("4.DELETE AT FIRST");
      System.out.println("5.DELETE AT LAST");
      System.out.println("6.DELETE AT POSITION");
      System.out.println("7.DISPLAY THE LINKEDLIST");
      System.out.println("8.TO EXIT THE PROGRAm");
      System.out.println("ENTER YOUR CHOICE");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("ENTER THE VALUE TO BE INSERTED AT FIRST");
          value = sc.nextInt();
          ll.addFirst(value);
          break;
        case 2:
          System.out.println("ENTER THE VALUE TO BE INSERTED IN LAST");
          value = sc.nextInt();
          ll.addLast(value);
          break;
        case 3:
          System.out.println("ENTER THE POSITION TO INSERT THE DATA");
          pos = sc.nextInt();
          System.out.println("ENTER THE VALUE TO INSERT AT " + pos + ":");
          value = sc.nextInt();
          ll.addAtPos(value, pos);
          break;
        case 4:
          System.out.println("DELETED ELEMENT AT LAST : " + ll.deleteAtLast());
          break;
        case 5:
          System.out.println("DELETED ELEMENT AT FIRST : " + ll.deleteAtfirst());
          break;
        case 6:
          System.out.println("ENETR THE POSITION TO DELETE THE VALUE");
          pos = sc.nextInt();
          System.out.println("DELETED ELEMENT AT GIVEN " + pos + ":" + ll.deleteAtPos(pos));
          break;

        case 7:
          System.out.println("Linked list Elemnets : ");
          ll.display();
          break;
        case 8:
          System.out.println("EXITING PROGRAM.. ");
          return;
        default:
          System.out.println("INVALID CHOICE..");
          break;
      }
    } while (choice != 9);
    sc.close();
  }

}