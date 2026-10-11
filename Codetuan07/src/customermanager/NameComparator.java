package customermanager;
import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCustomer_Name().compareTo(o2.getCustomer_Name());
    }
}