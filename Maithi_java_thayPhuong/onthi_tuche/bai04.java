import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai04 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        List<SinhVien> all = tree.getAll();
        List<SinhVien> nam = new ArrayList<SinhVien>();
        List<SinhVien> nu = new ArrayList<SinhVien>();
        List<SinhVien> conductE = new ArrayList<SinhVien>();
        List<SinhVien> conductG = new ArrayList<SinhVien>();
        List<SinhVien> conductF = new ArrayList<SinhVien>();
        List<SinhVien> conductP = new ArrayList<SinhVien>();

        for (SinhVien sv : all) {
            if (sv.gender.equalsIgnoreCase("Nam")) nam.add(sv);
            if (sv.gender.equalsIgnoreCase("Nữ")) nu.add(sv);
            if (sv.conduct.equalsIgnoreCase("E")) conductE.add(sv);
            if (sv.conduct.equalsIgnoreCase("G")) conductG.add(sv);
            if (sv.conduct.equalsIgnoreCase("F")) conductF.add(sv);
            if (sv.conduct.equalsIgnoreCase("P")) conductP.add(sv);
        }

        System.out.println("\nBAI 04 - LOC THEO GIOI TINH VA HANH KIEM");
        ConsoleUtil.printTable("Danh sach sinh vien nam", nam);
        ConsoleUtil.printTable("Danh sach sinh vien nu", nu);
        ConsoleUtil.printTable("Danh sach hanh kiem E", conductE);
        ConsoleUtil.printTable("Danh sach hanh kiem G", conductG);
        ConsoleUtil.printTable("Danh sach hanh kiem F", conductF);
        ConsoleUtil.printTable("Danh sach hanh kiem P", conductP);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
