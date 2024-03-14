import java.util.Scanner;

public class Main {
    public static void Random_dice(int i, int j, int k) {
        if (i == j && j == k) {
            System.out.println(10000 + (i * 1000));
        } else if (i == j || i == k) {
            System.out.println(1000 + (i * 100));
        } else if (j == k) {
            System.out.println(1000 + (j * 100));
        } else {
            if (i > j && i > k) {
                System.out.println(100 * i);
            } else if (j > i && j > k) {
                System.out.println(100 * j);
            } else {
                System.out.println(100 * k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        Random_dice(a, b, c);
    }
}
