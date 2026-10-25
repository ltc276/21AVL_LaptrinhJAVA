//Yêu cầu 2.1, 2.2: Tính tổng số sinh viên và điểm trung bình
import java.util.List;
public class Lab02 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        List<Student> list = tree.getAll();
        System.out.println("Yêu cầu 2.1, 2.2: Tính tổng số sinh viên và điểm trung bình");
        double sum = 0;

        for (Student s : list) {
            sum += s.result;
        }

        System.out.println("Tong so sinh vien: " + tree.size());
        System.out.printf("Diem trung binh: %.2f%n", sum / tree.size());
    }
}
