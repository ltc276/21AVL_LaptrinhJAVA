package JavaCore;

//Bai10.java
import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     ArrayList<Integer> a = new ArrayList<>();

     System.out.print("Nhap n = ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         System.out.print("a[" + i + "] = ");
         a.add(sc.nextInt());
     }

     ArrayList<Integer> daXuat = new ArrayList<>();

     System.out.println("Cac phan tu xuat hien trong mang:");

     for (int i = 0; i < a.size(); i++) {
         int x = a.get(i);

         if (!daXuat.contains(x)) {
             System.out.println(x);
             daXuat.add(x);
         }
     }

     sc.close();
 }
}