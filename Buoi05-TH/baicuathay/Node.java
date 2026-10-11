package tree;

public class Node {
    int label;
    Node left;
    Node right;

    public Node(int value) {
        this.label = value;
        this.left = null;
        this.right = null;
    }
}