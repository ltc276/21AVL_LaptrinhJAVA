import java.util.Scanner;

public class bai08 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        System.out.println("\nBAI 08 - XOA SINH VIEN THEO ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can xoa: ", 1);
        if (tree.delete(id)) {
            System.out.println("Da xoa sinh vien co ID " + id + ".");
            ConsoleUtil.printTable("Danh sach sau khi xoa", tree.getAll());
        } else {
            System.out.println("Khong tim thay sinh vien co ID " + id + ".");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
