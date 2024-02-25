package CircularLL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CLL {

    public Node head;
    public Node tail;
    public int count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    // method to add the element at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        count++;
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        count++;
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;

        }
    }

    // function to inset the element at any position
    public void addAtPos(int data, int pos) {
        if (pos < 0 || pos > count) {
            System.out.println("Element cannot be inserted . Invalid position");
        } else if (pos == 0) {
            addFirst(data);
        } else if (pos == count) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            count++;
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // method to display the linked list eleemnts
    public void display() {
        if (isEmpty()) {
            System.out.println("\nNo element to delete\n");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // function to delete the node at first
    int deleteFirst() {
        if (isEmpty()) {
            System.out.println("linked list empty.element cannot be deleted");
            return -1;
        }
        if (count == 1) {
            int val = head.data;
            head = tail = null;
            count--;
            return val;
        } else {
            Node current = head;
            head = head.next;
            tail.next = head;
            int val = current.data;
            count--;
            return val;
        }
    }

    // function to delete the element at last
    int deleteAtLast() {
        if (isEmpty()) {
            System.out.println("linked list is empty. No element to delete");
            return -1;
        }
        if (count == 1) {
            int val = head.data;
            head = tail = null;
            count--;
            return val;
        } else {
            Node prev = head;
            while (prev.next != head)
                prev = prev.next;
            int val = tail.data;
            prev.next = head;
            tail = prev;
            count--;
            return val;
        }
    }

    // function to delete the element at particular position
    int deleteAtPos(int pos) {
        if (pos < 0 || pos >= count) {
            System.out.println("invalid position element cannot be deleted.");
            return -1;
        }
        if (pos == 0)
            return deleteFirst();
        else if (pos == count)
            return deleteAtLast();
        else {
            Node current = head;
            Node prev = null;
            for (int i = 1; i <= pos; i++) {
                prev = current;
                current = current.next;
            }

            int val = current.data;
            prev.next = current.next;
            if (current == tail) {
                tail = prev;
            }
            count--;
            return val;
        }
    }
}

public class CircularLL {
    public static void main(String[] args) {
        CLL cl = new CLL();
        cl.addFirst(1);
        cl.addFirst(2);
        cl.addLast(567);
        cl.addLast(55);
        System.out.print("before deletion : ");
        cl.display();
        System.out.println("Number of nodes before deletion : " + cl.count);
        System.out.println("deleted element : " + cl.deleteAtPos(4)); // its based on zero based indexing give it
                                                                      // accordingly to get the proper out put
        System.out.print("after deletion : ");
        cl.display();
        System.out.println("Number of nodes " + cl.count);
    }

}
