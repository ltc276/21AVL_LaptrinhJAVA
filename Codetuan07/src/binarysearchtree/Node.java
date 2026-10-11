package binarysearchtree;

import customermanager.Customer;

public class Node {

    public Customer data;
    public Node left;
    public Node right;

    public Node(Customer value) {
        data = value;
        left = null;
        right = null;
    }
}