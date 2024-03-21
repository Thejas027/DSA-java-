package Questions;

/*
 * RECURSIVE METHOD OF PRE ORDER IS USED TO PRINT ALL THE NODES IN K-th LEVEL OF A TREE 
 */
import java.util.Scanner;

class Node {
    int data;
    Node lchild;
    Node rchild;

    public Node(int data) {
        this.data = data;
        this.lchild = null;
        this.rchild = null;
    }
}

class Tree {
    // function to print the K-th level nodes data

    public void kLevel(Node root, int level, int k) {
        if (root == null)
            return;

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.lchild, level + 1, k);
        kLevel(root.rchild, level + 1, k);
    }
}

public class KLvlNodes {
    public static void main(String[] args) {
        Node root = null;
        Tree t = new Tree();

        root = new Node(1);
        root.lchild = new Node(2);
        root.rchild = new Node(3);
        root.lchild.lchild = new Node(4);
        root.lchild.rchild = new Node(5);
        root.rchild.lchild = new Node(6);
        root.rchild.rchild = new Node(7);
        int level = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the k value to print the nodes vlaue : ");
        int k = sc.nextInt();
        t.kLevel(root, level, k);

        sc.close();
    }
}
