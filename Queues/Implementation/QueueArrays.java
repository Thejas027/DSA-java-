package Queues.Implementation;

public class QueueArrays {

  static class Queue {
    static int arr[];
    static int size;
    static int rear = -1;

    Queue(int n) {
      arr = new int[n];
      size = n;
    }

    public static boolean isEmpty() {
      return rear == -1;
    }

    public static void add(int value) {
      if (rear == size - 1) {
        System.out.println("queue is full");
        return;
      }
      arr[++rear] = value;
    }
  }

  public static void main(String[] args) {

  }
}