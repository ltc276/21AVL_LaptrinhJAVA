import java.util.Collections;
import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);

        System.out.println("\nBAI 07 - TIM KHACH HANG THEO ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can tim: ", 1);
        Customer c = tree.find(id);
        if (c == null) {
            System.out.println("Khong tim thay khach hang co ID " + id + ".");
        } else {
            ConsoleUtil.printTable("Ket qua tim kiem", Collections.singletonList(c));
        }
        sc.close();
    }
}
