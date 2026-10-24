import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);

        System.out.println("\nBAI 01 - NHAP KHACH HANG VAO CAY BST THEO ID");
        int n = ConsoleUtil.readInt(sc, "Nhap so khach hang muon them: ", 1);
        for (int i = 1; i <= n; i++) {
            System.out.println("\nKhach hang thu " + i + ":");
            Customer c = ConsoleUtil.readCustomer(sc);
            if (tree.insert(c)) {
                System.out.println("Da them khach hang vao BST.");
            } else {
                System.out.println("ID da ton tai, khong them khach hang nay.");
            }
        }
        ConsoleUtil.printTable("Danh sach sau khi nhap", tree.getAll());
        CustomerFile.saveToFile(tree, CustomerFile.DATA_FILE);
        sc.close();
    }
}
