import java.util.Scanner;

public class Bai11 {

    // In mảng
    public static void xuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Tìm kiếm phần tử trong mảng đã sắp xếp
    public static int timKiem(int[] a, int n, int x) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Thêm phần tử vào đúng vị trí
    public static int them(int[] a, int n, int x) {
        int i = n - 1;

        // Dời các phần tử lớn hơn x sang phải
        while (i >= 0 && a[i] > x) {
            a[i + 1] = a[i];
            i--;
        }

        // Đưa x vào vị trí thích hợp
        a[i + 1] = x;

        return n + 1;
    }

    // Xóa phần tử tại vị trí pos
    public static int xoa(int[] a, int n, int pos) {
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        return n - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Mảng phải có dư chỗ để thêm phần tử
        int[] a = new int[100];

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        System.out.println("Nhap mang da sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Mang ban dau: ");
        xuatMang(a, n);

        // Tìm kiếm
        System.out.print("Nhap phan tu can tim: ");
        int x = sc.nextInt();

        int pos = timKiem(a, n, x);

        if (pos != -1) {
            System.out.println("Tim thay " + x + " tai vi tri " + pos);
        } else {
            System.out.println("Khong tim thay " + x);
        }

        // Thêm
        System.out.print("Nhap phan tu can them: ");
        int y = sc.nextInt();

        n = them(a, n, y);

        System.out.print("Mang sau khi them: ");
        xuatMang(a, n);

        // Xóa
        System.out.print("Nhap phan tu can xoa: ");
        int z = sc.nextInt();

        pos = timKiem(a, n, z);

        if (pos != -1) {
            n = xoa(a, n, pos);

            System.out.print("Mang sau khi xoa: ");
            xuatMang(a, n);
        } else {
            System.out.println("Khong tim thay " + z + " de xoa.");
        }

        sc.close();
    }
}