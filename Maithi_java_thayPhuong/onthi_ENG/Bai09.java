import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);

        while (true) {
            System.out.println("\nBAI 09 - LUU VA DOC FILE");
            System.out.println("1. Luu danh sach hien tai vao customers.txt");
            System.out.println("2. Doc lai file (thay danh sach hien tai)");
            System.out.println("0. Thoat chuong trinh");
            int choice = ConsoleUtil.readInt(sc, "Chon: ", 0);
            switch (choice) {
                case 1:
                    CustomerFile.saveToFile(tree, CustomerFile.DATA_FILE);
                    break;
                case 2:
                    CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
                    ConsoleUtil.printTable("Danh sach sau khi doc file", tree.getAll());
                    break;
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Vui long chon 0, 1 hoac 2.");
            }
        }
    }
}
