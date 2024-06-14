import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BoxCnt = scanner.nextInt();
        double result = Math.pow(2,BoxCnt);
        System.out.println((int) result);
    }
}
