import java.util.Scanner;

public class bai02 {
    public static void run(Scanner sc, BSTCustomer tree) {
        ConsoleUtil.printTable("BAI 02 - DANH SACH KHACH HANG (DUYET BST THEO ID)", tree.getAll());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
