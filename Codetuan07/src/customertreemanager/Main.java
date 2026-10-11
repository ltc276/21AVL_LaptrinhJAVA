package customertreemanager;

public class Main {

    public static Customer addCustomer(Customer root, Customer value) {

        if (root == null)
            return new Customer(value.getCustomer_ID(),
                    value.getCustomer_Name(),
                    value.getCustomer_Gender(),
                    value.getCustomer_Age());

        if (value.getCustomer_ID() < root.getCustomer_ID()) {

            if (root.left == null)
                root.left = new Customer(value.getCustomer_ID(),
                        value.getCustomer_Name(),
                        value.getCustomer_Gender(),
                        value.getCustomer_Age());
            else
                root.left = addCustomer(root.left, value);

        }
        else {

            if (root.right == null)
                root.right = new Customer(value.getCustomer_ID(),
                        value.getCustomer_Name(),
                        value.getCustomer_Gender(),
                        value.getCustomer_Age());
            else
                root.right = addCustomer(root.right, value);
        }

        return root;
    }

    // ĐÂY LÀ PHẦN BỔ SUNG TỪ ẢNH BẠN GỬI
    public static void readtree(Customer root) {
        if (root != null) {
            readtree(root.left);
            System.out.print(root.getCustomer_ID() + " ");
            readtree(root.right);
        }
    }

    public static void main(String[] args) {

        Customer u1 = new Customer(107, "an", "nam", 30);
        Customer u2 = new Customer(101, "hoa", "nu", 20);
        Customer u3 = new Customer(105, "khanh", "nam", 35);
        Customer u4 = new Customer(103, "mai", "nu", 28);
        Customer u5 = new Customer(109, "huy", "nam", 40);
        Customer u6 = new Customer(102, "binh", "nam", 25);
        Customer u7 = new Customer(104, "thuan", "nam", 37);

        Customer root = null;

        root = addCustomer(root, u1);
        root = addCustomer(root, u2);
        root = addCustomer(root, u3);
        root = addCustomer(root, u4);
        root = addCustomer(root, u5);
        root = addCustomer(root, u6);
        root = addCustomer(root, u7);

        System.out.println("Duyet cay theo LNR:");
        readtree(root);
    }
}