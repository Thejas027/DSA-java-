package Questions;
/*
 * PROGRAM TO KNOW THE LOWEST COMMON ANCESTOR OF A GIVEN TWO NODES
 */

import java.util.ArrayList;
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
    // function to return the lowest common ancestor

    // supporting function to find the path
    public boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;

        path.add(root);

        if (root.data == n)
            return true;

        boolean foundLeft = getPath(root.lchild, n, path);
        boolean foundRight = getPath(root.rchild, n, path);

        if (foundLeft || foundRight)
            return true;

        path.remove(path.size() - 1);

        return false;
    }
    // main function that returns the lowest common ancestor value to main function

    public Node LCA(Node root, int n1, int n2) { // LCA ---Lowest Common Ancestor
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i))
                break;
        }

        Node lca = path1.get(i - 1);

        return lca;
    }
}

public class LowestCommonAncestor {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 and n2 value to find their ancestors(both n1 and n2 should be present in tree ) : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(t.LCA(root, n1, n2).data);
        sc.close();
    }
}
