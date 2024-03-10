class Node {
    Node lchild;
    int data;
    Node rchild;

    public Node(int data) {
        this.data = data;
        this.rchild = null;
        this.lchild = null;
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

    // in order travesal

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.lchild);
            System.out.print(root.data + " ");
            inOrder(root.rchild);
        }
    }

    boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null)
            return true;
        else if (root == null || subroot == null || root.data != subroot.data)
            return false;

        if (!isIdentical(root.lchild, subroot.lchild))
            return false;
        if (!isIdentical(root.rchild, subroot.rchild))
            return false;

        return true;
    }

    boolean isSubtree(Node root, Node subroot) {
        if (root == null)
            return false;

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot))
                return true;
        }
        return isSubtree(root.lchild, subroot) || isSubtree(root.rchild, subroot);
    }
}

public class SubTree {
    public static void main(String[] args) {
        Node root = null;
        Tree t = new Tree();
        root = t.bulidTree(root, 10);
        root = t.bulidTree(root, 8);
        root = t.bulidTree(root, 15);
        root = t.bulidTree(root, 4);
        root = t.bulidTree(root, 9);
        System.out.println("In Order : ");
        t.inOrder(root);

        Node subRoot = null;
        subRoot = t.bulidTree(subRoot, 8);
        subRoot = t.bulidTree(subRoot, 4);
        subRoot = t.bulidTree(subRoot, 94);
        System.out.println("\nInorder of Sub Tree");
        t.inOrder(subRoot);

        System.out.println();
        System.out.println(t.isSubtree(root, subRoot));
    }
}
