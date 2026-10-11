package tree;

public class Main {

    // 1. Tìm node ngoài cùng bên phải
    public static Node therightNode(Node root) {
        if (root == null) return null;
        if (root.right == null) return root;
        else return therightNode(root.right);
    }

    // 2. Tính tổng tất cả label trên cây (sumNode)
    public static int sumNode(Node root) {
        if (root == null) return 0;
        return root.label + sumNode(root.left) + sumNode(root.right);
    }

    // 3. Tính giá trị trung bình các label của cây
    public static double averageNode(Node root) {
        int totalNodes = countNode(root);
        if (totalNodes == 0) return 0;
        return (double) sumNode(root) / totalNodes;
    }

    // Các phương thức đã có từ trước
    public static int countNode(Node root) {
        if (root == null) return 0;
        else return 1 + countNode(root.left) + countNode(root.right);
    }

    public static int countLeaf(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        else return countLeaf(root.left) + countLeaf(root.right);
    }

    public static Node theleftNode(Node root) {
        if (root == null) return null;
        if (root.left == null) return root;
        else return theleftNode(root.left);
    }

    public static void readtree(Node root) {
        if (root != null) {
            readtree(root.right);
            readtree(root.left);
            System.out.print(root.label + " ");
        }
    }

    public static void main(String[] args) {
        // Dựng cây nhị phân
        Node n1 = new Node(1);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n15 = new Node(15);
        Node n17 = new Node(17);

        n3.left = n1;   n3.right = n4;
        n9.left = n8;   n9.right = n10;
        n15.left = n13; n15.right = n17;
        n5.left = n3;   n5.right = n6;
        n12.left = n9;  n12.right = n15;
        n7.left = n5;   n7.right = n12;

        Node root = n7;

        // In kết quả các yêu cầu mới
        Node rightNode = therightNode(root);
        if (rightNode != null) {
            System.out.println("Node ben phai nhat cua cay root la: " + rightNode.label);
        }

        int totalSum = sumNode(root);
        System.out.println("Tong cac label cua cay (sumNode) la: " + totalSum);

        double avg = averageNode(root);
        System.out.println("Gia tri trung binh cac label cua cay la: " + avg);
    }
}