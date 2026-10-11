package tree;

public class Main {

    // Tìm node ngoài cùng bên trái
    public static Node theleftNode(Node root) {
        if (root == null) return null;
        if (root.left == null) return root;
        else return theleftNode(root.left);
    }

    // Đếm số nút lá
    public static int countLeaf(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        else return countLeaf(root.left) + countLeaf(root.right);
    }

    // Đếm tổng số nút trên cây
    public static int countNode(Node root) {
        if (root == null) return 0;
        else return 1 + countNode(root.left) + countNode(root.right);
    }

    // Duyệt cây theo thứ tự RLN (Right - Left - Node)
    public static void readtree(Node root) {
        if (root != null) {
            readtree(root.right);
            readtree(root.left);
            System.out.print(root.label + " ");
        }
    }

    public static void main(String[] args) {
        // 1. Khởi tạo các nút
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

        // 2. Thiết lập liên kết cây nhị phân
        n3.left = n1;   n3.right = n4;
        n9.left = n8;   n9.right = n10;
        n15.left = n13; n15.right = n17;
        n5.left = n3;   n5.right = n6;
        n12.left = n9;  n12.right = n15;
        n7.left = n5;   n7.right = n12;

        Node root = n7;

        // 3. Thực thi và xuất kết quả
        System.out.println("Doc cay root theo thu tu RLN: ");
        readtree(root);
        System.out.println();

        System.out.println("Tong so node cua cay root la: " + countNode(root));
        System.out.println("Tong so node la cua cay root la: " + countLeaf(root));
        
        Node leftNode = theleftNode(root);
        if (leftNode != null) {
            System.out.println("Node ben trai nhat cua cay root la: " + leftNode.label);
        }
    }
}