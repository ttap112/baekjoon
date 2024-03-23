import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int Fn = scan.nextInt();
            int Sn = scan.nextInt();

            if (Fn == 0 && Sn == 0) {
                break;
            } else {
                System.out.println(Fn+Sn);
            }
        }
    }
}