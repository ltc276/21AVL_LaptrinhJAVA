//Yêu cầu 4.3: Sắp xếp danh sách đậu và rớt theo tên
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab09 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        System.out.println("Yêu cầu 4.3: Sắp xếp danh sách đậu và rớt theo tên");
        List<Student> dau = new ArrayList<Student>();
        List<Student> rot = new ArrayList<Student>();

        for (Student s : tree.getAll()) {
            if (s.result >= 5) dau.add(s);
            else rot.add(s);
        }

        Comparator<Student> byName = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.name.compareToIgnoreCase(b.name);
            }
        };
        Collections.sort(dau, byName);
        Collections.sort(rot, byName);

        ConsoleUtil.printTable("SINH VIEN DAU - SAP XEP TEN A-Z", dau);
        ConsoleUtil.printTable("SINH VIEN ROT - SAP XEP TEN A-Z", rot);
    }
}
