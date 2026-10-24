import java.util.Scanner;

public class lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);

        System.out.println("\nBAI 08 - XOA KHACH HANG THEO ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can xoa: ", 1);
        if (tree.delete(id)) {
            System.out.println("Da xoa khach hang co ID " + id + ".");
            ConsoleUtil.printTable("Danh sach sau khi xoa", tree.getAll());
            CustomerFile.saveToFile(tree, CustomerFile.DATA_FILE);
        } else {
            System.out.println("Khong tim thay khach hang co ID " + id + ".");
        }
        sc.close();
    }
}
