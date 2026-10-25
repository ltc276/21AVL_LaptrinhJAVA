//Yêu cầu 2.3: Tính tỉ lệ sinh viên theo xếp loại
import java.util.List;

public class Lab03 {
    public static void main(String[] args) {
        BSTStudent tree = ConsoleUtil.getStudentTree();
        List<Student> list = tree.getAll();
        int gioi = 0, kha = 0, trungBinh = 0, yeu = 0;

        System.out.println("Yêu cầu 2.3: Tính tỉ lệ sinh viên theo xếp loại");

        for (Student s : list) {
            if (s.result >= 8) gioi++;
            else if (s.result >= 7) kha++;
            else if (s.result >= 5) trungBinh++;
            else yeu++;
        }

        System.out.println("Tong so sinh vien: " + list.size());
        System.out.printf("Gioi (>= 8): %d - %.1f%%%n", gioi, gioi * 100.0 / list.size());
        System.out.printf("Kha (>= 7 va < 8): %d - %.1f%%%n", kha, kha * 100.0 / list.size());
        System.out.printf("Trung binh (>= 5 va < 7): %d - %.1f%%%n", trungBinh, trungBinh * 100.0 / list.size());
        System.out.printf("Yeu (< 5): %d - %.1f%%%n", yeu, yeu * 100.0 / list.size());
    }
}
