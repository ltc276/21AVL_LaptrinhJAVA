import java.util.Scanner;
public class Bai08 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
	    int a = 1;
	    int b = 1;
	    System.out.print(a + " ");
	    System.out.print(b + " ");
	    for (int i = 2;i<n;i++) {
	    	int c = a+ b;
	    	System.out.print(c + " ");
	    	a=b;
	    	b=c;
	    }
    
        
}
}
