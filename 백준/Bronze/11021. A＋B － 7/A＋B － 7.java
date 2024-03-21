import java.util.Scanner;

public class Main {
    public static void Sum(int a, Scanner scan) {
        for (int i = 0; i<a; i++) {
            int j = scan.nextInt();
            int k = scan.nextInt();
            System.out.println("Case "+"#"+(i+1)+": "+(j+k));
        }
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();

    Sum(a, scan);
    }
}