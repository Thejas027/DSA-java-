package Queues.PQueue;

import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    String Name;
    int rank;

    public Student(String Name, int rank) {
        this.Name = Name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
        return this.rank - s2.rank;
    }
}

public class PQueueObj {
    public static void main(String[] args) {
        PriorityQueue<Student> st = new PriorityQueue<>();

        st.add(new Student("A", 5));
        st.add(new Student("B", 15));
        st.add(new Student("C", 2));
        st.add(new Student("D", 30));
        st.add(new Student("E", 45));

        while (!st.isEmpty()) {
            System.out.println(st.peek().Name + " -> " + st.peek().rank);
            st.remove();
        }
    }
}
