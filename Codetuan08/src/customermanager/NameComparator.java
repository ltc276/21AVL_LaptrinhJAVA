package customermanager;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomer_Name().compareToIgnoreCase(c2.getCustomer_Name());
    }
}
