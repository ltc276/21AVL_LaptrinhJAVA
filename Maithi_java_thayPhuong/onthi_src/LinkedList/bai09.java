import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class bai09 {
    public static void saveToFile(BSTCustomer tree, String fileName) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName), StandardCharsets.UTF_8)) {
            for (Customer c : tree.getAll()) {
                writer.write(c.toFileLine());
                writer.newLine();
            }
            System.out.println("Da luu " + tree.size() + " khach hang vao file " + fileName + ".");
        } catch (IOException e) {
            System.out.println("Loi khi luu file: " + e.getMessage());
        }
    }

    public static int loadFromFile(BSTCustomer tree, String fileName) {
        if (!Files.exists(Paths.get(fileName))) {
            System.out.println("Chua co file " + fileName + "; danh sach dang rong.");
            return 0;
        }

        int count = 0;
        tree.clear();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] part = line.split("\\|", -1);
                if (part.length != 5) continue;
                try {
                    int id = Integer.parseInt(part[0].trim());
                    String name = part[1].trim();
                    String gender = part[2].trim();
                    int age = Integer.parseInt(part[3].trim());
                    String blood = part[4].trim().toUpperCase();
                    if (id > 0 && !name.isEmpty() && age >= 0
                            && (gender.equalsIgnoreCase("Nam") || gender.equalsIgnoreCase("Nữ"))
                            && (blood.equals("A") || blood.equals("B") || blood.equals("O"))) {
                        if (tree.insert(new Customer(id, name, gender, age, blood))) count++;
                    }
                } catch (NumberFormatException e) {
                    // Bo qua dong co du lieu khong hop le.
                }
            }
            System.out.println("Da doc " + count + " khach hang tu file " + fileName + ".");
        } catch (IOException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
        }
        return count;
    }

    public static void run(Scanner sc, BSTCustomer tree) {
        while (true) {
            System.out.println("\nBAI 09 - LUU VA DOC FILE");
            System.out.println("1. Luu danh sach hien tai");
            System.out.println("2. Doc lai file (thay danh sach hien tai)");
            System.out.println("0. Quay lai menu chinh");
            int choice = ConsoleUtil.readInt(sc, "Chon: ", 0);
            switch (choice) {
                case 1:
                    saveToFile(tree, Menu.DATA_FILE);
                    break;
                case 2:
                    loadFromFile(tree, Menu.DATA_FILE);
                    ConsoleUtil.printTable("Danh sach sau khi doc file", tree.getAll());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Vui long chon 0, 1 hoac 2.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTCustomer tree = new BSTCustomer();
        loadFromFile(tree, Menu.DATA_FILE);
        run(sc, tree);
    }
}
