import java.util.Scanner;

public class Menu {
    public static final String DATA_FILE = "sinhvien.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSinhVien tree = new BSTSinhVien();

        System.out.println("============================================");
        System.out.println(" LAB TONG ON GIUA KY - CAY BST SINH VIEN");
        System.out.println("============================================");
        bai09.loadFromFile(tree, DATA_FILE);

        while (true) {
            System.out.println("\n============== MENU CHINH ==============");
            System.out.println("01. Nhap danh sach sinh vien vao BST");
            System.out.println("02. Xuat danh sach sinh vien dang bang");
            System.out.println("03. Tuoi trung binh, lon tuoi nhat, nho tuoi nhat");
            System.out.println("04. Loc nam, nu va hanh kiem E/G/F/P");
            System.out.println("05. Sap xep sinh vien nam theo ten");
            System.out.println("06. Tim nam lon tuoi nhat va nho tuoi nhat");
            System.out.println("07. Tim sinh vien theo ID");
            System.out.println("08. Xoa sinh vien theo ID");
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
