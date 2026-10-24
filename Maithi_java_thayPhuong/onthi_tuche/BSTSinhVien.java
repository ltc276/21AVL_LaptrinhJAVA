import java.util.ArrayList;
import java.util.List;

public class BSTSinhVien {
    private class Node {
        SinhVien sinhVien;
        Node left;
        Node right;

        Node(SinhVien sinhVien) {
            this.sinhVien = sinhVien;
        }
    }

    private Node root;

    public boolean insert(SinhVien sinhVien) {
        if (find(sinhVien.id) != null) {
            return false;
        }
        root = insert(root, sinhVien);
        return true;
    }

    private Node insert(Node node, SinhVien sinhVien) {
        if (node == null) {
            return new Node(sinhVien);
        }
        if (sinhVien.id < node.sinhVien.id) {
            node.left = insert(node.left, sinhVien);
        } else if (sinhVien.id > node.sinhVien.id) {
            node.right = insert(node.right, sinhVien);
        }
        return node;
    }

    public SinhVien find(int id) {
        Node node = root;
        while (node != null) {
            if (id == node.sinhVien.id) {
                return node.sinhVien;
            }
            if (id < node.sinhVien.id) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }

    public boolean delete(int id) {
        if (find(id) == null) {
            return false;
        }
        root = delete(root, id);
        return true;
    }

    private Node delete(Node node, int id) {
        if (node == null) {
            return null;
        }
        if (id < node.sinhVien.id) {
            node.left = delete(node.left, id);
        } else if (id > node.sinhVien.id) {
            node.right = delete(node.right, id);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            node.sinhVien = successor.sinhVien;
            node.right = delete(node.right, successor.sinhVien.id);
        }
        return node;
    }

    public List<SinhVien> getAll() {
        List<SinhVien> result = new ArrayList<SinhVien>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(Node node, List<SinhVien> result) {
        if (node != null) {
            inOrder(node.left, result);
            result.add(node.sinhVien);
            inOrder(node.right, result);
        }
    }

    public void clear() {
        root = null;
    }

    public int size() {
        return count(root);
    }

    private int count(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + count(node.left) + count(node.right);
    }
}
