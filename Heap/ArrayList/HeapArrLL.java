package Heap.ArrayList;

import java.util.ArrayList;

class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    // function to add the element to heap
    public void add(int data) {
        arr.add(data);
        int x = arr.size() - 1; // child indes
        int parent = (x - 1) / 2; // parent index of a node

        while (arr.get(x) < arr.get(parent)) {
            // statements to swap the elements
            int temp = arr.get(x);
            arr.set(x, arr.get(parent));
            arr.set(parent, temp);

            x = parent;
            parent = (x - 1) / 2;
        }
    }

    // function to peek the min heap element

    public int peek() {
        return arr.get(0); // index is zero since at 0th index element value is minimum in min heap
    }

    private void heapifiy(int i) {
        int leftChild = 2 * i + 1;
        int rightchild = 2 * i + 2;
        int minIdx = i;
        if (leftChild < arr.size() && arr.get(minIdx) > arr.get(leftChild))
            minIdx = leftChild;

        if (rightchild < arr.size() && arr.get(minIdx) > arr.get(rightchild))
            minIdx = rightchild;

        if (minIdx != i) {
            // perform swpaing
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapifiy(minIdx);
        }
    }

    // function to delete
    public int remove() {
        int data = arr.get(0);

        // step-1 to swap the 1st and last element
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // step -2 to remove the last element

        arr.remove(arr.size() - 1);

        // step -3 Heapifiy
        heapifiy(0);
        return data;
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }
}

public class HeapArrLL {
    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
