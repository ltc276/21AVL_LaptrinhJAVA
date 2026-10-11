import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Bai 01");
            System.out.println("2. Bai 11");
            System.out.println("3. Bai 06");
            System.out.println("4. Bai 07");
            System.out.println("5. Bai 08");
            System.out.println("6. Bai 09");
            System.out.println("7. Bai 10");
            System.out.println("0. Thoat");
            System.out.println("==========================");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    Bai1.main(null);
                    break;

                case 2:
                	Bai11.main(null);
                    break;

                case 3:
                	 Bai06.main(null);
                     break;

                case 4:
                    Bai07.main(null);
                    break;

                case 5:
                    Bai08.main(null);
                    break;

                case 6:
                	 Bai09.main(null);
                     break;
                case 7:
               	 	Bai10.main(null);
                    break;
                   

                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}