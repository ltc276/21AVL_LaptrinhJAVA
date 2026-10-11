
public class Bai09 {

    static int nhiphan[] = new int[4];

    public static void xuat(int n) {
        if (n == 4) {
            for (int i = 0; i < 4; i++) {
                System.out.print(nhiphan[i]);
            }
            System.out.println();
        } else {
            nhiphan[n] = 0;
            xuat(n + 1);

            nhiphan[n] = 1;
            xuat(n + 1);
        }
    }

    public static void main(String[] args) {
        xuat(0);
    }
}