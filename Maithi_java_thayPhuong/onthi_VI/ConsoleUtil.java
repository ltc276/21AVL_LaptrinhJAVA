import java.util.*;
public class ConsoleUtil {
      public static int readInt(Scanner sc, String prompt, int min) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                if (value >= min) return value;
            } catch (NumberFormatException e) {
                // Nhap lai neu du lieu khong phai so nguyen.
            }
            System.out.println("Vui long nhap so nguyen >= " + min + ".");
        }
    }
    public static Customer readCustomer(Scanner sc){
        int id = new Random().nextInt(1000)+1;
        String hoten;
        do {
            System.out.print("Ho va ten: ");
            hoten = sc.nextLine().trim();
            if(hoten.isEmpty()){
                System.out.println("Ho ten khong duoc de trong.");
            }

        }while(hoten.isEmpty());

        String gioitinh;
        while(true){
            System.out.print("Gioi tinh: ");
            gioitinh = sc.nextLine().trim();
             if (gioitinh.equalsIgnoreCase("nam") || gioitinh.equalsIgnoreCase("m")
                    || gioitinh.equalsIgnoreCase("male")) {
                gioitinh = "Nam";
                break;
            }
            if (gioitinh.equalsIgnoreCase("nu") || gioitinh.equalsIgnoreCase("nữ")
                    || gioitinh.equalsIgnoreCase("f") || gioitinh.equalsIgnoreCase("female")) {
                gioitinh = "Nữ";
                break;
            }
            System.out.println("Chi nhap Nam hoac Nu.");
        }
        int tuoi = readInt(sc,"Tuoi: ", 1);
        String nhommau;
        while(true){
            System.out.print("Nhom mau: ");
            nhommau = sc.nextLine().trim().toUpperCase();
            if (nhommau.equals("A") || nhommau.equals("B") || nhommau.equals("O")) break;
            System.out.println("Chi nhap A, B hoac O theo yeu cau bai lab.");
        }
        return new Customer(id, hoten, gioitinh, tuoi, nhommau);

    }
        public static void printTable(String title, List<Customer> customers) {
        System.out.println("\n" + title);
        if (customers == null || customers.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("+----------+--------------------------------------+----------+-------+-------+");
        System.out.printf("| %-8s | %-36s | %-8s | %-5s | %-5s |%n",
                "ID", "Ho va ten", "Gioi tinh", "Tuoi", "Mau mau");
        System.out.println("+----------+--------------------------------------+----------+-------+-------+");
        for (Customer c : customers) {
            System.out.printf("| %-8d | %-36s | %-8s | %-5d | %-5s |%n",
                    c.id, c.hoten, c.gioitinh, c.tuoi, c.nhommau);
        }
        System.out.println("+----------+--------------------------------------+----------+-------+-------+");
        System.out.println("Tong so: " + customers.size());
    }

}