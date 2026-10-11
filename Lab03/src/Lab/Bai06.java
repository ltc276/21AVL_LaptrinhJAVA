package Lab.Bai06;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            int x = sc.nextInt();
            a.add(x);
        }

        int max = a.get(0);
        int min = a.get(0);
        int sum = 0;

        for (int i = 0; i < a.size(); i++) {
            int x = a.get(i);

            if (x > max) {
                max = x;
            }

            if (x < min) {
                min = x;
            }

            sum += x;
        }

        double trungBinh = (double) sum / n;

        int demLonHon = 0;
        int demNhoHon = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > trungBinh) {
                demLonHon++;
            }

            if (a.get(i) < trungBinh) {
                demNhoHon++;
            }
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
        System.out.println("Gia tri trung binh: " + trungBinh);
        System.out.println("So luong lon hon trung binh: " + demLonHon);
        System.out.println("So luong nho hon trung binh: " + demNhoHon);

        sc.close();
    }
}
