import java.util.Scanner;

public class Main{

    public static void Count(int a, Scanner scan) {
        int range = scan.nextInt();
        int total = 0;
        int sum = 0;
        for (int i=1; i<=range; i++) {
            int money = scan.nextInt();
            int count = scan.nextInt();
            sum = (money * count);
            total += sum;
        }
        if (total == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        Count(total, scan);
    }
}