

import java.util.Scanner;

public class bai01 {
    public static void run(Scanner sc, BSTCustomer tree) {
        System.out.println("\nBAI 01 - NHAP KHACH HANG VAO CAY BST THEO ID");
        int n = ConsoleUtil.readInt(sc, "Nhap so khach hang: ", 1);
        for (int i = 1; i <= n; i++) {
            System.out.println("\nKhach hang thu " + i + ":");
            Customer c = ConsoleUtil.readCustomer(sc);
            if (tree.insert(c)) {
                System.out.println("Da them khach hang vao BST.");
            } else {
                System.out.println("ID da ton tai, khong them khach hang nay.");
            }
        }
        System.out.println("Danh sach hien co " + tree.size() + " khach hang.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
