package customermanager;
import java.util.Comparator;

public class IDComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getCustomer_ID() > o2.getCustomer_ID())
            return 1;
        if (o1.getCustomer_ID() < o2.getCustomer_ID())
            return -1;
        return 0;
    }
}