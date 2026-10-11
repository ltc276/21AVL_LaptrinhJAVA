import java.util.Scanner;
public class Bai06 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int [] a = new int [n];
       
        for (int i=0;i<n;i++) {
        	System.out.print("Phan tu a["+i+"] bang: ");
        	a[i]=sc.nextInt();
      
    }
        int max = a[0];
        int min = a[0];
        for (int i=1;i<n;i++) {
           	if(a[i]>max) {
        		max = a[i];
        	}
        	if(a[i]<min) {
        		min = a[i];
        	}
        }
        int tb = 0;
        for (int i=0;i<n;i++) {
        	tb = tb+a[i];
        }
        tb=tb/n;
        int tbnho = 0;
        int tblon = 0;
        for (int i=0;i<n;i++) {
        	if(tb>a[i]) {
        		tblon++;
        	}
        	if(tb<a[i]) {
        		tbnho++;
        	}
        }
      	System.out.println("max la: "+max);
    	System.out.println("min la: "+min);
    	System.out.println("tb la: "+tb);
    	System.out.println("so nho hon trung binh la: "+tbnho);
    	System.out.println("so lon hon trung binh la: "+tblon);
}
}
