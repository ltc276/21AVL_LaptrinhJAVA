//Yêu cầu 3.1: Tìm sinh viên theo ID
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTStudent tree = ConsoleUtil.getStudentTree();
        System.out.println("Yêu cầu 3.1: Tìm sinh viên theo ID");
        int id = ConsoleUtil.readInt(sc, "Nhap ID can tim: ");
        Student s = tree.find(id);

        List<Student> result = new ArrayList<Student>();
        if (s != null) result.add(s);
        else System.out.println("Khong tim thay sinh vien co ID " + id + ".");
        ConsoleUtil.printTable("KET QUA TIM KIEM", result);
        sc.close();
    }
}
