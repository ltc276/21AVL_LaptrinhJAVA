import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
    public static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen.");
            }
        }
    }
    public static void printTable(String title, List<Student> students) {
        System.out.println("\n" + title);
        if (students.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.println("+------+----------------------+----------+--------+");
        System.out.printf("| %-4s | %-20s | %-8s | %-6s |%n", "ID", "Ho va ten", "Gioi tinh", "Diem");
        System.out.println("+------+----------------------+----------+--------+");
        for (Student s : students) {
            System.out.printf("| %-4d | %-20s | %-8s | %6.1f |%n",
                    s.id, s.name, s.gender, s.result);
        }
        System.out.println("+------+----------------------+----------+--------+");
        System.out.println("Tong so: " + students.size());
    }
    private static final BSTStudent tree = createTree();
    private static BSTStudent createTree() {
    BSTStudent tree = new BSTStudent();
        tree.insert(new Student(104, "Le Van Minh", "nam", 6));
        tree.insert(new Student(106, "Do Phuong Mai", "nu", 8.5));
        tree.insert(new Student(102, "Le Thi Hoang Anh", "nu", 2.5));
        tree.insert(new Student(107, "Pham Tuan Hai", "nam", 4));
        tree.insert(new Student(101, "Tran Van Tra", "nam", 9));
        tree.insert(new Student(103, "Le Vu Long", "nam", 3));
        tree.insert(new Student(108, "Phan Thi Yen", "nu", 7));
        tree.insert(new Student(109, "Le Van Chau", "nam", 6.5));
        tree.insert(new Student(112, "Pham Tra My", "nu", 7.5));
        tree.insert(new Student(105, "Dong Van Trang", "nam", 5.5));
            return tree;
    }
    public static BSTStudent getStudentTree() {
        return tree;
    }

}
