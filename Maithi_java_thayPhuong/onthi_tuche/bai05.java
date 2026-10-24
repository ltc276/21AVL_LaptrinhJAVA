import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class bai05 {
    public static void run(Scanner sc, BSTSinhVien tree) {
        List<SinhVien> nam = new ArrayList<SinhVien>();
        for (SinhVien c : tree.getAll()) {
            if (c.gender.equalsIgnoreCase("Nam")) nam.add(c);
        }

        final Collator collator = Collator.getInstance(Locale.forLanguageTag("vi-VN"));
        Collections.sort(nam, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b) {
                int result = collator.compare(a.name, b.name);
                if (result == 0) return a.id - b.id;
                return result;
            }
        });
        ConsoleUtil.printTable("BAI 05 - SINH VIEN NAM SAP XEP THEO TEN", nam);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();
        bai09.loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
