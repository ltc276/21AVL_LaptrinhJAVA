import java.util.ArrayList;
import java.util.List;

public class lab04 {
    public static void main(String[] args) {
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
        List<Customer> all = tree.getAll();
        List<Customer> nam = new ArrayList<Customer>();
        List<Customer> nu = new ArrayList<Customer>();
        List<Customer> mauA = new ArrayList<Customer>();
        List<Customer> mauB = new ArrayList<Customer>();
        List<Customer> mauO = new ArrayList<Customer>();

        for (Customer c : all) {
            if (c.gioitinh.equalsIgnoreCase("Nam")) nam.add(c);
            if (c.gioitinh.equalsIgnoreCase("Nữ")) nu.add(c);
            if (c.nhommau.equalsIgnoreCase("A")) mauA.add(c);
            if (c.nhommau.equalsIgnoreCase("B")) mauB.add(c);
            if (c.nhommau.equalsIgnoreCase("O")) mauO.add(c);
        }

        System.out.println("\nBAI 04 - LOC THEO GIOI TINH VA NHOM MAU");
        ConsoleUtil.printTable("Danh sach khach hang nam", nam);
        ConsoleUtil.printTable("Danh sach khach hang nu", nu);
        ConsoleUtil.printTable("Danh sach nhom mau A", mauA);
        ConsoleUtil.printTable("Danh sach nhom mau B", mauB);
        ConsoleUtil.printTable("Danh sach nhom mau O", mauO);
    }
}
