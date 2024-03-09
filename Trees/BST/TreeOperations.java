package Trees.BST;

import java.util.LinkedList;
import java.util.Queue;

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
    public Node bulidTree(Node root, int data) {
        Node newnNode = new Node(data);
        if (root == null) {
            root = newnNode;
            return root;
        }
        if (data < root.data) {
            root.lchild = bulidTree(root.lchild, data);
        } else if (data >= root.data) {
            root.rchild = bulidTree(root.rchild, data);
        }
        return root;
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.lchild);
            preOrder(root.rchild);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.lchild);
            System.out.print(root.data + " ");
            inOrder(root.rchild);
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.lchild);
            postOrder(root.rchild);
            System.out.print(root.data + " ");
        }
    }

    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.lchild != null)
                    q.add(currNode.lchild);
                if (currNode.rchild != null)
                    q.add(currNode.rchild);
            }
        }
    }

    // fi=unction to find the height of a tree
    int height(Node root) {
        int leftHeight, rightHeight;
        if (root != null) {
            leftHeight = height(root.lchild);
            rightHeight = height(root.rchild);

            return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
        }
        return 0;
    }

    // function to count the number of nodes in tree
    int countNode(Node root) {
        if (root != null)
            return countNode(root.lchild) + countNode(root.rchild) + 1;
        return 0;
    }

    // function to find the sum of all the nodes

    int sum(Node root) {
        if (root == null)
            return 0;

        int leftSum = sum(root.lchild);
        int rightSum = sum(root.rchild);
        return leftSum + rightSum + root.data;
    }
}

public class TreeOperations {
    public static void main(String[] args) {
        Node root = null;
        Tree t = new Tree();
        root = t.bulidTree(root, 10);
        root = t.bulidTree(root, 5);
        root = t.bulidTree(root, 15);
        root = t.bulidTree(root, 20);
        root = t.bulidTree(root, 11);
        System.out.print("Pre Order :");
        t.preOrder(root);
        System.out.println();
        System.out.print("\nPost Order :");
        t.postOrder(root);
        System.out.println();
        System.out.print("\nIn order :");
        t.inOrder(root);
        System.out.println();
        System.out.print("\nLevel Order :\n");
        t.levelOrder(root);
        System.out.println();
        System.out.println("The height of tree : " + t.height(root));
        System.out.println();
        System.out.println("Total number of nodes in BST : " + t.countNode(root));
        System.out.println();
        System.out.println("sum of tree : " + t.sum(root));
    }
}
