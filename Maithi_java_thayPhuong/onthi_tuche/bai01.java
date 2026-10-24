import java.util.Scanner;

public class bai01 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        System.out.println("\nBAI 01 - NHAP SINH VIEN VAO CAY BST THEO ID");
        int n = ConsoleUtil.readInt(sc, "Nhap so sinh vien: ", 1);
        for (int i = 1; i <= n; i++) {
            System.out.println("\nSinh vien thu " + i + ":");
            SinhVien c = ConsoleUtil.readSinhVien(sc);
            if (tree.insert(c)) {
                System.out.println("Da them sinh vien vao BST.");
            } else {
                System.out.println("ID da ton tai, khong them sinh vien nay.");
            }
        }
        System.out.println("Danh sach hien co " + tree.size() + " sinh vien.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
