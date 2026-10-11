package JavaCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai11 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     ArrayList<Integer> a = new ArrayList<>();

     System.out.print("Nhap n = ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         System.out.print("a[" + i + "] = ");
         a.add(sc.nextInt());
     }

     Collections.sort(a);

     System.out.println("Mang da sap xep: " + a);

     System.out.print("Nhap phan tu can tim: ");
     int x = sc.nextInt();

     int viTri = Collections.binarySearch(a, x);

     if (viTri >= 0) {
         System.out.println("Tim thay tai vi tri: " + viTri);
     } else {
         System.out.println("Khong tim thay");
     }

     System.out.print("Nhap phan tu can them: ");
     int them = sc.nextInt();

     int viTriThem = Collections.binarySearch(a, them);

     if (viTriThem < 0) {
         viTriThem = -viTriThem - 1;
     }

     a.add(viTriThem, them);

     System.out.println("Mang sau khi them: " + a);

     System.out.print("Nhap phan tu can xoa: ");
     int xoa = sc.nextInt();

     int viTriXoa = Collections.binarySearch(a, xoa);

     if (viTriXoa >= 0) {
         a.remove(viTriXoa);
         System.out.println("Mang sau khi xoa: " + a);
     } else {
         System.out.println("Khong tim thay phan tu can xoa");
     }

     sc.close();
 }
}
