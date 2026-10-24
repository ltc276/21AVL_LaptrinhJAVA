import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomerFile {
    public static final String DATA_FILE = "customers.txt";

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
                    String hoten = part[1].trim();
                    String gioitinh = part[2].trim();
                    int tuoi = Integer.parseInt(part[3].trim());
                    String nhommau = part[4].trim().toUpperCase();
                    boolean validGender = gioitinh.equalsIgnoreCase("Nam") || gioitinh.equalsIgnoreCase("Nữ");
                    boolean validBlood = nhommau.equals("A") || nhommau.equals("B") || nhommau.equals("O");
                    if (id > 0 && !hoten.isEmpty() && tuoi >= 0 && validGender && validBlood) {
                        if (tree.insert(new Customer(id, hoten, gioitinh, tuoi, nhommau))) count++;
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
}
