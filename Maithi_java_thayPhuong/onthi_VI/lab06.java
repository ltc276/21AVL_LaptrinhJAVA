import java.util.ArrayList;
import java.util.List;

public class lab06 {
    public static void main(String[] args) {
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
        List<Customer> nam = new ArrayList<Customer>();
        for (Customer c : tree.getAll()) {
            if (c.gioitinh.equalsIgnoreCase("Nam")) nam.add(c);
        }
        System.out.println("\nBAI 06 - NAM LON TUOI NHAT VA NHO TUOI NHAT");
        if (nam.isEmpty()) {
            System.out.println("Khong co khach hang nam.");
            return;
        }

        int max = nam.get(0).tuoi;
        int min = nam.get(0).tuoi;
        for (Customer c : nam) {
            if (c.tuoi > max) max = c.tuoi;
            if (c.tuoi < min) min = c.tuoi;
        }
        List<Customer> lonTuoi = new ArrayList<Customer>();
        List<Customer> nhoTuoi = new ArrayList<Customer>();
        for (Customer c : nam) {
            if (c.tuoi == max) lonTuoi.add(c);
            if (c.tuoi == min) nhoTuoi.add(c);
        }
        ConsoleUtil.printTable("Nam lon tuoi nhat (" + max + " tuoi)", lonTuoi);
        ConsoleUtil.printTable("Nam nho tuoi nhat (" + min + " tuoi)", nhoTuoi);
    }
}
