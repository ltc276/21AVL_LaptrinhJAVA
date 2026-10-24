public class lab02 {
    public static void main(String[] args) {
        BSTCustomer tree = new BSTCustomer();
        CustomerFile.loadFromFile(tree, CustomerFile.DATA_FILE);
        ConsoleUtil.printTable("BAI 02 - DANH SACH KHACH HANG (DUYET BST THEO ID)", tree.getAll());
    }
}