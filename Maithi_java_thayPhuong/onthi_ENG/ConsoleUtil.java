import java.util.List;
import java.util.Scanner;

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

    public static Customer readCustomer(Scanner sc) {
        int id = readInt(sc, "ID: ", 1);
        String name;
        do {
            System.out.print("Ho va ten: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) System.out.println("Ho ten khong duoc de trong.");
        } while (name.isEmpty());

        String gender;
        while (true) {
            System.out.print("Gioi tinh (Nam/Nu): ");
            gender = sc.nextLine().trim();
            if (gender.equalsIgnoreCase("nam") || gender.equalsIgnoreCase("m")
                    || gender.equalsIgnoreCase("male")) {
                gender = "Nam";
                break;
            }
            if (gender.equalsIgnoreCase("nu") || gender.equalsIgnoreCase("nữ")
                    || gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("female")) {
                gender = "Nữ";
                break;
            }
            System.out.println("Chi nhap Nam hoac Nu.");
        }

        int age = readInt(sc, "Tuoi: ", 0);
        String blood;
        while (true) {
            System.out.print("Nhom mau (A/B/O): ");
            blood = sc.nextLine().trim().toUpperCase();
            if (blood.equals("A") || blood.equals("B") || blood.equals("O")) break;
            System.out.println("Chi nhap A, B hoac O theo yeu cau bai lab.");
        }
        return new Customer(id, name, gender, age, blood);
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
                    c.id, c.name, c.gender, c.age, c.blood);
        }
        System.out.println("+----------+--------------------------------------+----------+-------+-------+");
        System.out.println("Tong so: " + customers.size());
    }
}
