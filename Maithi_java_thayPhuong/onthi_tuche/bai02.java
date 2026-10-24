import java.util.Scanner;

public class bai02 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        ConsoleUtil.printTable("BAI 02 - DANH SACH SINH VIEN (DUYET BST THEO ID)", tree.getAll());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
