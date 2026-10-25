//Yêu cầu 4.2: Sắp xếp danh sách đậu và rớt theo điểm thi
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab08 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        System.out.println("Yêu cầu 4.2: Sắp xếp danh sách đậu và rớt theo điểm thi");
        List<Student> dau = new ArrayList<Student>();
        List<Student> rot = new ArrayList<Student>();

        for (Student s : tree.getAll()) {
            if (s.result >= 5) dau.add(s);
            else rot.add(s);
        }

        Comparator<Student> byResult = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return Double.compare(a.result, b.result);
            }
        };
        Collections.sort(dau, byResult);
        Collections.sort(rot, byResult);

        ConsoleUtil.printTable("SINH VIEN DAU - SAP XEP DIEM TANG DAN", dau);
        ConsoleUtil.printTable("SINH VIEN ROT - SAP XEP DIEM TANG DAN", rot);
    }
}
