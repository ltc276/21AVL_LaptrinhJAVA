

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai03 {
    public static void run(Scanner sc, BSTCustomer tree) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
