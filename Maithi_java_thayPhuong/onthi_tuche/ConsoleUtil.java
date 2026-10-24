import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
    public static int readInt(Scanner sc, String prompt, int min) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                if (value >= min) {
                    return value;
                }
            } catch (NumberFormatException e) {
                // Nhap lai neu khong phai so nguyen.
            }
            System.out.println("Vui long nhap so nguyen >= " + min + ".");
        }
    }

    public static SinhVien readSinhVien(Scanner sc) {
        int id = readInt(sc, "ID: ", 1);

        String name;
        do {
            System.out.print("Ho va ten: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Ho ten khong duoc de trong.");
            }
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
        String conduct;
        while (true) {
            System.out.print("Hanh kiem (E/G/F/P): ");
            conduct = sc.nextLine().trim().toUpperCase();
            if (conduct.equalsIgnoreCase("E") || conduct.equalsIgnoreCase("G") || conduct.equalsIgnoreCase("F") || conduct.equalsIgnoreCase("P")) {
                if (conduct.equalsIgnoreCase("E")) conduct = "Excellent";
                else if (conduct.equalsIgnoreCase("G")) conduct = "Good";
                else if (conduct.equalsIgnoreCase("F")) conduct = "Fair";
                else if (conduct.equalsIgnoreCase("P")) conduct = "Poor";
                break;
            }
            System.out.println("Chi nhap E, G, F hoac P theo yeu cau bai lab.");
        }
        return new SinhVien(id, name, gender, age, conduct);
    }

    public static void printTable(String title, List<SinhVien> sinhViens) {
        System.out.println("\n" + title);
        if (sinhViens == null || sinhViens.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("+----------+--------------------------------------+------------+-------+------------+");
        System.out.printf("| %-8s | %-36s | %-10s | %-5s | %-10s |%n",
                "ID", "Ho va ten", "Gioi tinh", "Tuoi", "Hanh kiem");
        System.out.println("+----------+--------------------------------------+------------+-------+------------+");
        for (SinhVien c : sinhViens) {
            System.out.printf("| %-8d | %-36s | %-10s | %-5d | %-10s |%n",
                    c.id, c.name, c.gender, c.age, c.conduct);
        }
        System.out.println("+----------+--------------------------------------+------------+-------+------------+");
        System.out.println("Tong so: " + sinhViens.size());
    }
}
