import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        for (int i = 1; i <= Range; i++) {
            for (int j = Range - i; j >= 1; j--) {
                System.out.print(" ");
            }
            String stars = "*".repeat(2 * i - 1);
            System.out.println(stars);
        }
        for (int i = Range - 1; i >= 1; i--) {
            for (int j = 1; j <= Range - i; j++) {
                System.out.print(" ");
            }
            String stars = "*".repeat(2 * i - 1);
            System.out.println(stars);
        }
    }
}
