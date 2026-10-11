import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args)  {
    	   Scanner sc = new Scanner(System.in);

           System.out.print("Nhap A, B, C: ");
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
       if(a > b && a > c) {
           System.out.println("a la so lon nhat");
       } else if (b > a && b > c) {
           System.out.println("b la so lon nhat");
       } else {
           System.out.println("c la so lon nhat");
       }
       if(a < b && a < c) {
           System.out.println("a la so nho nhat");
       } else if (b < a && b < c) {
           System.out.println("b la so nho nhat");
       } else {
           System.out.println("c la so nho nhat");
       }
         System.out.println("-------------------------------------");
       int n=10;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       System.out.println("-------------------------------------");
       for(int i=1;i<=10;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=10;k>=i;k--){
            System.out.print("*");
        }
        System.out.println();
       }
       System.out.println("-------------------------------------");
       for(int row=1;row<=n;row++){
        for(int col=1;col<=n;col++){
            if(row==1 || row==n || col==1 || col==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

       System.out.println("-------------------------------------");
       for(int row=1;row<=n;row++){
        for(int col=1;col<=n;col++){
            if(row==1 || row==n || col==1 || col==n || row==col|| row+col==n+1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }

    }
}