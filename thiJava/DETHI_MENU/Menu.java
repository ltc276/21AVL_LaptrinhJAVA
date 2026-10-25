import java.util.Scanner;
import java.io.FilterInputStream;

public class Menu {
    public static void main(String[] args) {
        System.setIn(new FilterInputStream(System.in) {
            public void close() {}
        });

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========== MENU LAB JAVA ==========");
            System.out.println("1. Yeu cau 1: Tao BST va xuat sinh vien theo ID");
            System.out.println("2. Yeu cau 2.1, 2.2: Tinh tong so sinh vien va diem trung binh");
            System.out.println("3. Yeu cau 2.3: Tinh ti le sinh vien theo xep loai");
            System.out.println("4. Yeu cau 2.4: Tim sinh vien nam co diem cao nhat va thap nhat");
            System.out.println("5. Yeu cau 3.1: Tim sinh vien theo ID");
            System.out.println("6. Yeu cau 3.2: Xoa sinh vien theo ID");
            System.out.println("7. Yeu cau 4.1: Tach danh sach sinh vien dau va rot");
            System.out.println("8. Yeu cau 4.2: Sap xep danh sach dau va rot theo diem thi");
            System.out.println("9. Yeu cau 4.3: Sap xep danh sach dau va rot theo ten");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: Lab01.main(args); break;
                case 2: Lab02.main(args); break;
                case 3: Lab03.main(args); break;
                case 4: Lab04.main(args); break;
                case 5: Lab05.main(args); break;
                case 6: Lab06.main(args); break;
                case 7: Lab07.main(args); break;
                case 8: Lab08.main(args); break;
                case 9: Lab09.main(args); break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
