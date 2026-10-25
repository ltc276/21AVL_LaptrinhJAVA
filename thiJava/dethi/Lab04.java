//Yêu cầu 2.4: Tìm sinh viên nam có điểm cao nhất và thấp nhất
import java.util.ArrayList;
import java.util.List;

public class Lab04 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        List<Student> nam = new ArrayList<Student>();
        System.out.println("Yêu cầu 2.4: Tìm sinh viên nam có điểm cao nhất và thấp nhất");

        for (Student s : tree.getAll()) {
            if (s.gender.equalsIgnoreCase("nam")) nam.add(s);
        }

        if (nam.isEmpty()) {
            System.out.println("Khong co sinh vien nam.");
            return;
        }

        double max = nam.get(0).result;
        double min = nam.get(0).result;
        for (Student s : nam) {
            if (s.result > max) max = s.result;
            if (s.result < min) min = s.result;
        }

        List<Student> caoNhat = new ArrayList<Student>();
        List<Student> thapNhat = new ArrayList<Student>();
        for (Student s : nam) {
            if (s.result == max) caoNhat.add(s);
            if (s.result == min) thapNhat.add(s);
        }

        ConsoleUtil.printTable("SINH VIEN NAM CO DIEM CAO NHAT", caoNhat);
        ConsoleUtil.printTable("SINH VIEN NAM CO DIEM THAP NHAT", thapNhat);
    }
}
