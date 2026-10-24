

import java.util.Collections;
import java.util.Scanner;

public class bai07 {
    public static void run(Scanner sc, BSTCustomer tree) {
        System.out.println("\nBAI 07 - TIM KHACH HANG THEO ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can tim: ", 1);
        Customer c = tree.find(id);
        if (c == null) {
            System.out.println("Khong tim thay khach hang co ID " + id + ".");
        } else {
            ConsoleUtil.printTable("Ket qua tim kiem", Collections.singletonList(c));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
