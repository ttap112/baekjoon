import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int range = sc.nextInt();

        for (int i = 0; i < range; i++) {
            num.add(sc.nextInt());
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int n : num) {
            if (isPrime(n)) {
                primes.add(n);
            }
        }

        System.out.printf(String.valueOf(primes.size()));
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
