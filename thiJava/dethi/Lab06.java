//Yêu cầu 3.2: Xóa sinh viên theo ID
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTStudent tree = ConsoleUtil.getStudentTree();
        System.out.println("Yêu cầu 3.2: Xóa sinh viên theo ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can xoa: ");

        if (tree.delete(id)) {
            System.out.println("Da xoa sinh vien co ID " + id + ".");
            ConsoleUtil.printTable("DANH SACH SAU KHI XOA", tree.getAll());
        } else {
            System.out.println("Khong tim thay sinh vien co ID " + id + ".");
        }
        sc.close();
    }
}
