import java.util.ArrayList;
import java.util.List;

public class Bai06 {
    public static void main(String[] args) {
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
        List<Customer> nam = new ArrayList<Customer>();
        for (Customer c : tree.getAll()) {
            if (c.gender.equalsIgnoreCase("Nam")) nam.add(c);
        }
        System.out.println("\nBAI 06 - NAM LON TUOI NHAT VA NHO TUOI NHAT");
        if (nam.isEmpty()) {
            System.out.println("Khong co khach hang nam.");
            return;
        }

        int max = nam.get(0).age;
        int min = nam.get(0).age;
        for (Customer c : nam) {
            if (c.age > max) max = c.age;
            if (c.age < min) min = c.age;
        }
        List<Customer> lonTuoi = new ArrayList<Customer>();
        List<Customer> nhoTuoi = new ArrayList<Customer>();
        for (Customer c : nam) {
            if (c.age == max) lonTuoi.add(c);
            if (c.age == min) nhoTuoi.add(c);
        }
        ConsoleUtil.printTable("Nam lon tuoi nhat (" + max + " tuoi)", lonTuoi);
        ConsoleUtil.printTable("Nam nho tuoi nhat (" + min + " tuoi)", nhoTuoi);
    }
}
