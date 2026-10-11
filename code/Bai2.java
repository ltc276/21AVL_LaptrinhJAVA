import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Nhap so phan tu: ");
		Scanner nhap = new Scanner(System.in);
		n = nhap.nextInt();
		int dayso[] = new int[n];
		for (int i=0;i<n;i++) {
			System.out.println("Nhap phan tu "+(i+1)+ ":");
			dayso[i]=nhap.nextInt();
		}
	System.out.println("Day so vua nhap vao la:");
	for (int i=0;i<n;i++) System.out.print(dayso[i]+" ");
	System.out.println();
	
	System.out.println("Day so sau khi sap xep tang dan:");
	for (int i=0;i<n-1;i++) {
		for (int j=i+1;j<n;j++) {
			if (dayso[i]>dayso[j]) {
				int temp = dayso[i];
				dayso[i] = dayso[j];
				dayso[j]=temp;
			}
		}
	}	
	for (int i=0;i<n;i++) System.out.print(dayso[i]+" ");
	System.out.println();
	int check[] = new int[n];
	for (int i=0;i<n;i++) check[i]=1;
	for (int i=0;i<n-1;i++) {
		if (check[i]!=0) {
			for (int j=i+1;j<n;j++) {
				if (dayso[j]==dayso[i]) {
					check[i]++;
					check[j]=0;
				}
			}
		}
	}
	for (int i=0;i<n;i++) if (check[i]!=0) System.out.println("phan tu "+dayso[i]+" xuat hien "+check[i]+" lan");
	}


}
