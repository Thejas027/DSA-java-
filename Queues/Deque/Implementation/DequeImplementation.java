package Queues.Deque.Implementation;

import java.util.*;;

public class DequeImplementation {
  public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
    // operations performed in dequeue

    deque.addFirst(1); // element added at front end
    deque.addFirst(2);

    deque.addLast(5); // element added at rear end
    deque.addLast(10);

    System.out.println("elements before deletion : " + deque);

    deque.removeFirst(); // element removed at front end
    deque.removeLast(); // element removed at rear end

    System.out.println("elements after deletion : " + deque);

    // elements can be peeked at both ends using
    System.out.println("element at rear end : " + deque.getLast());
    System.out.println("element at front end : " + deque.getFirst());
  }
}
