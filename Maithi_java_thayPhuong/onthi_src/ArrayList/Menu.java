import java.util.Scanner;

public class Menu {
    public static final String DATA_FILE = "customers.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();

        System.out.println("============================================");
        System.out.println(" LAB TONG ON GIUA KY - CAY BST CUSTOMER");
        System.out.println("============================================");
        bai09.loadFromFile(tree, DATA_FILE);

        while (true) {
            System.out.println("\n============== MENU CHINH ==============");
            System.out.println("01. Nhap danh sach khach hang vao BST");
            System.out.println("02. Xuat danh sach khach hang dang bang");
            System.out.println("03. Tuoi trung binh, lon tuoi nhat, nho tuoi nhat");
            System.out.println("04. Loc nam, nu va nhom mau A/B/O");
            System.out.println("05. Sap xep khach hang nam theo ten");
            System.out.println("06. Tim nam lon tuoi nhat va nho tuoi nhat");
            System.out.println("07. Tim khach hang theo ID");
            System.out.println("08. Xoa khach hang theo ID");
            System.out.println("09. Luu / doc danh sach tu file");
            System.out.println("0.  Luu va thoat chuong trinh");
            int choice = ConsoleUtil.readInt(sc, "Nhap lua chon: ", 0);

            switch (choice) {
                case 1: bai01.run(sc, tree); break;
                case 2: bai02.run(sc, tree); break;
                case 3: bai03.run(sc, tree); break;
                case 4: bai04.run(sc, tree); break;
                case 5: bai05.run(sc, tree); break;
                case 6: bai06.run(sc, tree); break;
                case 7: bai07.run(sc, tree); break;
                case 8: bai08.run(sc, tree); break;
                case 9: bai09.run(sc, tree); break;
                case 0:
                    bai09.saveToFile(tree, DATA_FILE);
                    System.out.println("Da thoat chuong trinh.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
