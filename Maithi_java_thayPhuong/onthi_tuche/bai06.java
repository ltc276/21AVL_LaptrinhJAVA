import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai06 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        List<SinhVien> nam = new ArrayList<SinhVien>();
        for (SinhVien c : tree.getAll()) {
            if (c.gender.equalsIgnoreCase("Nam")) nam.add(c);
        }
        System.out.println("\nBAI 06 - NAM LON TUOI NHAT VA NHO TUOI NHAT");
        if (nam.isEmpty()) {
            System.out.println("Khong co sinh vien nam.");
            return;
        }

        int max = nam.get(0).age;
        int min = nam.get(0).age;
        for (SinhVien c : nam) {
            if (c.age > max) max = c.age;
            if (c.age < min) min = c.age;
        }
        List<SinhVien> lonTuoi = new ArrayList<SinhVien>();
        List<SinhVien> nhoTuoi = new ArrayList<SinhVien>();
        for (SinhVien c : nam) {
            if (c.age == max) lonTuoi.add(c);
            if (c.age == min) nhoTuoi.add(c);
        }
        ConsoleUtil.printTable("Nam lon tuoi nhat (" + max + " tuoi)", lonTuoi);
        ConsoleUtil.printTable("Nam nho tuoi nhat (" + min + " tuoi)", nhoTuoi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
