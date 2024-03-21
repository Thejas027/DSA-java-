package Questions;

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
    // using the concept of level order traversal, the bottom view of a tree can be
    // obtained

    /*
     * function to print the bottom view elements of a tree where it uses hashmap
     * concept and horizontal distance (hd)
     */
    class info {
        Node node;
        int hd;

        public info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void bottomView(Node root) {
        Queue<info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            info currNode = q.remove();

            if (currNode == null) {
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
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
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }
}

class BottomView {
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

        t.bottomView(root);
    }
}
