
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
            Node newNode = new Node(data);
            Node current = head;
            count++;
            for (int i = 0; i < pos; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
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

    public void reverse() {
        Node prev = null;
        Node current = tail = head;
        Node currentNext;
        while (current != null) {
            currentNext = current.next;
            current.next = prev;
            prev = current;
            current = currentNext;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // FUNCTION TO FIND WEATHER THE LINKED LIST IS PALINDROME

    public Node findMid(Node head) {
        Node slowNode = head;
        Node fastNode = head;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 to find the mid element
        Node mid = findMid(head);
        // step 2 to reverse the second half of linked list
        Node prev = null;
        Node current = mid;
        Node currentNext;
        while (current != null) {
            currentNext = current.next;
            current.next = prev;
            prev = current;
            current = currentNext;
        }
        Node right = prev;
        Node left = head;
        // step 3 to compare both the halfs linked list
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // function to detect the loop in a cycle
    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // function to remove the cycle in a linked lsit
    public void RemoveCycle() {
        Node slow = head;
        Node fast = head;
        @SuppressWarnings("unused")
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

            }
        }
        if (slow != fast) {
            return;
        }
        if (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        int choice, value, pos, N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nMENU");
            System.out.println("1.ADD ELEMENT AT FIRST");
            System.out.println("2.ADD ELEMENT AT LAST");
            System.out.println("3.ADD ELEMENT AT POSITON");
            System.out.println("4.DELETE AT FIRST");
            System.out.println("5.DELETE AT LAST");
            System.out.println("6.DELETE AT POSITION");
            System.out.println("7.DISPLAY THE LINKEDLIST");
            System.out.println("8.TO REVERSE THE LINKED LIST");
            System.out.println("9.ENTER THE N VALUE TO DELETE THE NODE FROM LAST");
            System.out.println("10.TO CHECK THE PALINDROME");
            System.out.println("11.TO CHECK WEATHER THE LINKED LIST HAS A LOOP IN IT OR NOT");
            System.out.println("12.TO EXIT THE PROGRAM");
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
                    System.out.print("REVERDED LIST : ");
                    ll.reverse();
                    ll.display();
                    break;
                case 9:
                    System.out.println("ENTER THE N VALUE TO DELTE THE NODE");
                    N = sc.nextInt();
                    ll.deleteNthfromEnd(N);
                    break;
                case 10:
                    if (ll.isPalindrome()) {
                        System.out.println("Linked list is palindrome");
                    } else {
                        System.out.println("It's not a palindroem");
                    }
                    break;
                case 11:
                    if (ll.detectCycle()) {
                        System.out.println("it has loop in it");
                    } else {
                        System.out.println("No loop in a linked list");
                    }
                    break;
                case 12:
                    System.out.println("EXITING PROGRAM.. ");
                    return;
                default:
                    System.out.println("INVALID CHOICE..");
                    break;
            }
        } while (choice != 12);
        sc.close();
    }
}
