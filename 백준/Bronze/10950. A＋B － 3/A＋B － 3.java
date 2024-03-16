import java.util.Scanner;

public class Main {
    public static void account(int a, Scanner scan) {
        for (int i = 0; i < a; i++) {
            int j = scan.nextInt();
            int k = scan.nextInt();
            System.out.println(j + k);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        account(i, scan);
        // Scanner 객체 닫기
        scan.close();
    }
}