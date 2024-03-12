package Queues.PQueue;

import java.util.PriorityQueue;

public class PQueueJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // to reverse the queue pass Comparator.reverseOrder() in
                                                           // PriorityQueue

        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
