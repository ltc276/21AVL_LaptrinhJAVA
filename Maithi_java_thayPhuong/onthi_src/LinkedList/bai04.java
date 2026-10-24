import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bai04 {
    public static void run(Scanner sc, BSTCustomer tree) {
        List<Customer> all = tree.getAll();
        List<Customer> nam = new LinkedList<Customer>();
        List<Customer> nu = new LinkedList<Customer>();
        List<Customer> mauA = new LinkedList<Customer>();
        List<Customer> mauB = new LinkedList<Customer>();
        List<Customer> mauO = new LinkedList<Customer>();

        for (Customer c : all) {
            if (c.gender.equalsIgnoreCase("Nam")) nam.add(c);
            if (c.gender.equalsIgnoreCase("Nữ")) nu.add(c);
            if (c.blood.equalsIgnoreCase("A")) mauA.add(c);
            if (c.blood.equalsIgnoreCase("B")) mauB.add(c);
            if (c.blood.equalsIgnoreCase("O")) mauO.add(c);
        }

        System.out.println("\nBAI 04 - LOC THEO GIOI TINH VA NHOM MAU");
        ConsoleUtil.printTable("Danh sach khach hang nam", nam);
        ConsoleUtil.printTable("Danh sach khach hang nu", nu);
        ConsoleUtil.printTable("Danh sach nhom mau A", mauA);
        ConsoleUtil.printTable("Danh sach nhom mau B", mauB);
        ConsoleUtil.printTable("Danh sach nhom mau O", mauO);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
