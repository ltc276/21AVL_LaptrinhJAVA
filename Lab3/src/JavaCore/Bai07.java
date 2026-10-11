package JavaCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai07 {
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

        
        System.out.println("\nDay so da nhap:");
        System.out.println(a);

        
        ArrayList<Integer> tang = new ArrayList<>(a);
        Collections.sort(tang);

        
        System.out.println("Day so tang dan:");
        System.out.println(tang);

        
        ArrayList<Integer> giam = new ArrayList<>(a);
        Collections.sort(giam, Collections.reverseOrder());

        
        System.out.println("Day so giam dan:");
        System.out.println(giam);

        sc.close();
    }
}


