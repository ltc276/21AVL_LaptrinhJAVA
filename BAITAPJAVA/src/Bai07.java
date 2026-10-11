import java.util.Scanner;
public class Bai07 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int [] a = new int [n];
       
        for (int i=0;i<n;i++) {
        	System.out.print("Phan tu a["+i+"] bang: ");
        	a[i]=sc.nextInt();
      
    }
        System.out.print("Day da nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        System.out.println("\nTang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nGiam dan: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
}
}
