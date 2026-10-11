package JavaCore;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> f = new LinkedList<>();

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        f.add(1);
        f.add(1);

        for (int i = 2; i < n; i++) {
            int x = f.get(i - 1) + f.get(i - 2);
            f.add(x);
        }

        System.out.println("Day Fibonacci:");

        for (int i = 0; i < f.size(); i++) {
            System.out.print(f.get(i) + " ");
        }

        sc.close();
    }
}
