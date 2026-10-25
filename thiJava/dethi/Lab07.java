//Yêu cầu 4.1: Tách danh sách sinh viên đậu và rớt
import java.util.ArrayList;
import java.util.List;

public class Lab07 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        System.out.println("Yêu cầu 4.1: Tách danh sách sinh viên đậu và rớt");
        List<Student> dau = new ArrayList<Student>();
        List<Student> rot = new ArrayList<Student>();

        for (Student s : tree.getAll()) {
            if (s.result >= 5) dau.add(s);
            else rot.add(s);
        }

        ConsoleUtil.printTable("DANH SACH SINH VIEN DAU (DIEM >= 5)", dau);
        ConsoleUtil.printTable("DANH SACH SINH VIEN ROT (DIEM < 5)", rot);
    }
}
