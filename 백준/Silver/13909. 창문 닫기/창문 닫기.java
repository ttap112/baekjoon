import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int Number = Scan.nextInt();
        int openCount = 0;
        for (int i = 1; i * i <= Number; i++) {
            openCount++;
        }
        System.out.println(openCount);
    }
}
