// package Queues.Implementation;

public class QueueArrays {

  static class Queue {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    Queue(int n) {
      arr = new int[n];
      size = n;
      front = -1;
      rear = -1;
    }

    public static boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    public static void add(int value) {
      if (rear == size - 1) {
        System.out.println("queue is full");
        return;
      }
      if (front == -1) {
        front = rear = 0;
        arr[front] = value;
      } else if (rear == size - 1 && front != 0) {
        rear = 0;
        arr[rear] = value;
      } else
        arr[++rear] = value;
    }

    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }

      int value = arr[front++];
      if (front > rear) {
        front = rear = -1;
      }
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
      for (int i = front; i <= rear; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

  }

  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Queue q = new Queue(5);

    q.add(10);
    q.add(20);
    q.add(30);
    q.remove();
    q.display();
    System.out.println("peek : " + q.peek());
  }
}