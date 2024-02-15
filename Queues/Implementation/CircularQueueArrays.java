package Queues.Implementation;

public class CircularQueueArrays {

  static class Queue {
    static int arr[];
    static int size;
    static int rear = -1;
    static int front;

    public Queue(int n) {
      arr = new int[n];
      size = n;
      front = -1;
      rear = -1;
    }

    public static boolean isEmpty() {
      return rear == -1;
    }

    public static boolean isFull() {
      return (rear + 1) % size == front;
    }

    public static void add(int value) {
      if (isFull()) {
        System.out.println("queue is full");
        return;
      }
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      arr[rear] = value;
    }

    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      int value = arr[front];
      if (rear == front) {
        front = rear = -1;
      } else
        front = (front + 1) % size;
      return value;
    }

    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[front];
    }

    public static void display() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
      }
      int i = front ;
      do {
        System.out.print(arr[i] + " ");
        i = (i + 1) % size;
      } while (i != (rear + 1) % size);
    }

  }
 @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Queue q = new Queue(10);
    q.add(10);
    q.add(20);
    q.remove();
    q.display();

  }
}
