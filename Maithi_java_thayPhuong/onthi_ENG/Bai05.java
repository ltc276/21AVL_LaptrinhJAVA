import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Bai05 {
    public static void main(String[] args) {
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
        List<Customer> nam = new ArrayList<Customer>();
        for (Customer c : tree.getAll()) {
            if (c.gender.equalsIgnoreCase("Nam")) nam.add(c);
        }

        final Collator collator = Collator.getInstance(Locale.forLanguageTag("vi-VN"));
        Collections.sort(nam, new Comparator<Customer>() {
            public int compare(Customer a, Customer b) {
                int result = collator.compare(a.name, b.name);
                if (result == 0) return a.id - b.id;
                return result;
            }
        });
        ConsoleUtil.printTable("BAI 05 - KHACH HANG NAM SAP XEP THEO TEN", nam);
    }
}
