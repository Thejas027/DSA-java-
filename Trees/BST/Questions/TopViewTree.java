package Questions;

// package Questions;

import java.util.HashMap;
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

    // function for level order travesal

    public void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.lchild != null)
                    q.add(currNode.lchild);
                if (currNode.rchild != null)
                    q.add(currNode.rchild);
            }
        }
    }

    // using the concept of level order travesal the top view of a tree can be taken

    /*
     * function to print the top view elements of a tree where it uses haspmap
     * concept and horizantal distance (hd)
     */
    class info {
        Node node;
        int hd;

        public info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void topView(Node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new info(root, 0));

        while (!q.isEmpty()) {
            info currNode = q.remove();

            if (!map.containsKey(currNode.hd))
                map.put(currNode.hd, currNode.node);

            if (currNode.node.lchild != null) {
                q.add(new info(currNode.node.lchild, currNode.hd - 1));
                min = Math.min(min, currNode.hd - 1);
            }

            if (currNode.node.rchild != null) {
                q.add(new info(currNode.node.rchild, currNode.hd + 1));
                max = Math.max(max, currNode.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

}

public class TopViewTree {
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

        t.topView(root);
    }
}
