import java.util.ArrayList;
import java.util.List;

public class BSTStudent {
    private class Node {
        Student student;
        Node left;
        Node right;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node root;

    public boolean insert(Student student) {
        if (find(student.id) != null) return false;
        root = insert(root, student);
        return true;
    }

    private Node insert(Node node, Student student) {
        if (node == null) return new Node(student);

        if (student.id < node.student.id) {
            node.left = insert(node.left, student);
        } else if (student.id > node.student.id) {
            node.right = insert(node.right, student);
        }
        return node;
    }

    public Student find(int id) {
        Node node = root;
        while (node != null) {
            if (id == node.student.id) return node.student;
            if (id < node.student.id) node = node.left;
            else node = node.right;
        }
        return null;
    }

    public boolean delete(int id) {
        if (find(id) == null) return false;
        root = delete(root, id);
        return true;
    }

    private Node delete(Node node, int id) {
        if (node == null) return null;

        if (id < node.student.id) {
            node.left = delete(node.left, id);
        } else if (id > node.student.id) {
            node.right = delete(node.right, id);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node next = node.right;
            while (next.left != null) next = next.left;
            node.student = next.student;
            node.right = delete(node.right, next.student.id);
        }
        return node;
    }

    public List<Student> getAll() {
        List<Student> list = new ArrayList<Student>();
        inOrder(root, list);
        return list;
    }

    private void inOrder(Node node, List<Student> list) {
        if (node != null) {
            inOrder(node.left, list);
            list.add(node.student);
            inOrder(node.right, list);
        }
    }

    public int size() {
        return count(root);
    }

    private int count(Node node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }
}
