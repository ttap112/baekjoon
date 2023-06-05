import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int number = scanner.nextInt();

            int reverse = 0;
            int temp = number;

            while (temp != 0) {
                int remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp /= 10;
            }

            int sum = number + reverse;

            if (isPalindrome(sum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        return number == reverse;
    }
}

