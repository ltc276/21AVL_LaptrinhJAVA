import java.util.Collections;
import java.util.Scanner;

public class bai07 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        System.out.println("\nBAI 07 - TIM SINH VIEN THEO ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can tim: ", 1);
        SinhVien c = tree.find(id);
        if (c == null) {
            System.out.println("Khong tim thay sinh vien co ID " + id + ".");
        } else {
            ConsoleUtil.printTable("Ket qua tim kiem", Collections.singletonList(c));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
