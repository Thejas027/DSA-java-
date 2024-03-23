package Tries;

class Node {
    Node children[] = new Node[26];
    boolean eow = false;

    Node() {
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }
}

public class CreatingTries {

    public static Node root = new Node(); // no data is stored in a root node only its children contains some value

    public static void main(String[] args) {

    }
}
