import java.util.Scanner;
public class Menu {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	double x,y;
    	char cont = 'c';
    	do {
    	System.out.println("Nhap X: ");
    	x=sc.nextDouble();
    	System.out.println("Nhap Y: ");
    	y=sc.nextDouble();
    	System.out.println("Nhap phep can tinh + - * chia: ");
    	char op = sc.next().charAt(0);
    	switch (op) {
    	case '+':
    		System.out.println("KQ cong: "+(x+y));
    		break;
    	case '-':
    		System.out.println("KQ tru: "+(x-y));
    		break;
    	case '*':
    		System.out.println("KQ nhan: "+(x*y));
    		break;
    	case '/':
    		System.out.println("KQ chia: "+(x/y));
    		break;
    	
    	}
    	System.out.println("Tiep thi an 'c' khong thi phim 'k': ");
    	cont = sc.next().charAt(0);
    	}while(cont!='k');
    	sc.close();
    	  
}
}