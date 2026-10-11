package JavaCore;


import java.util.ArrayList;
import java.util.Scanner;

public class Bai09 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     ArrayList<String> ds = new ArrayList<>();

     System.out.print("Nhap n = ");
     int n = sc.nextInt();

     int soLuong = 1;

     for (int i = 0; i < n; i++) {
         soLuong *= 2;
     }

     for (int i = 0; i < soLuong; i++) {
         String nhiPhan = String.format("%" + n + "s",
                 Integer.toBinaryString(i)).replace(' ', '0');
         ds.add(nhiPhan);
     }

     for (String s : ds) {
         System.out.println(s);
     }

     sc.close();
 }
}