import java.util.LinkedList;
import java.util.List;

public class BSTCustomer {
    private class Node {
        Customer customer;
        Node left;
        Node right;

        Node(Customer customer) {
            this.customer = customer;
        }
    }

    private Node root;

    public boolean insert(Customer customer) {
        if (find(customer.id) != null) {
            return false;
        }
        root = insert(root, customer);
        return true;
    }

    private Node insert(Node node, Customer customer) {
        if (node == null) {
            return new Node(customer);
        }
        if (customer.id < node.customer.id) {
            node.left = insert(node.left, customer);
        } else if (customer.id > node.customer.id) {
            node.right = insert(node.right, customer);
        }
        return node;
    }

    public Customer find(int id) {
        Node node = root;
        while (node != null) {
            if (id == node.customer.id) {
                return node.customer;
            }
            if (id < node.customer.id) {
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
        if (id < node.customer.id) {
            node.left = delete(node.left, id);
        } else if (id > node.customer.id) {
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
            node.customer = successor.customer;
            node.right = delete(node.right, successor.customer.id);
        }
        return node;
    }

    public List<Customer> getAll() {
        List<Customer> result = new LinkedList<Customer>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(Node node, List<Customer> result) {
        if (node != null) {
            inOrder(node.left, result);
            result.add(node.customer);
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
