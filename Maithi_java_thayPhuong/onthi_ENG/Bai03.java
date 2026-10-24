import java.util.ArrayList;
import java.util.List;

public class Bai03 {
    public static void main(String[] args) {
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
        List<Customer> list = tree.getAll();
        System.out.println("\nBAI 03 - THONG KE TUOI");
        if (list.isEmpty()) {
            System.out.println("Danh sach rong, khong the thong ke.");
            return;
        }

        int tongTuoi = 0;
        int maxTuoi = list.get(0).age;
        int minTuoi = list.get(0).age;
        for (Customer c : list) {
            tongTuoi += c.age;
            if (c.age > maxTuoi) maxTuoi = c.age;
            if (c.age < minTuoi) minTuoi = c.age;
        }
        System.out.printf("Tuoi trung binh: %.2f%n", (double) tongTuoi / list.size());

        List<Customer> lonTuoi = new ArrayList<Customer>();
        List<Customer> nhoTuoi = new ArrayList<Customer>();
        for (Customer c : list) {
            if (c.age == maxTuoi) lonTuoi.add(c);
            if (c.age == minTuoi) nhoTuoi.add(c);
        }
        ConsoleUtil.printTable("Khach hang lon tuoi nhat (" + maxTuoi + " tuoi)", lonTuoi);
        ConsoleUtil.printTable("Khach hang nho tuoi nhat (" + minTuoi + " tuoi)", nhoTuoi);
    }
}
