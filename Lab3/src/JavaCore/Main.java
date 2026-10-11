package JavaCore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("6. Bai 6");
            System.out.println("7. Bai 7");
            System.out.println("8. Bai 8");
            System.out.println("9. Bai 9");
            //System.out.println("10. Bai 10");
            System.out.println("11. Bai 11");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            switch (chon) {
                case 6:
                    Bai06.main(null);
                    break;

                case 7:
                    Bai07.main(null);
                    break;

                case 8:
                    Bai08.main(null);
                    break;

                case 9:
                    Bai09.main(null);
                    break;

                case 10:
                    //Bai10.main(null);
                    break;

                case 11:
                    Bai11.main(null);
                    break;

                case 0:
                    System.out.println("Thoat!");
                    break;

                default:
                    System.out.println("Khong co bai nay!");
            }

        } while (chon != 0);

        sc.close();
    }
}