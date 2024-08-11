import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        
        for (int i = 0; i < range; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            if (N == 0) {
                System.out.println(1);
                continue;
            }

            BigInteger numerator = BigInteger.ONE;
            BigInteger denominator = BigInteger.ONE;

            for (int j = 0; j < N; j++) {
                numerator = numerator.multiply(BigInteger.valueOf(M - j));
                denominator = denominator.multiply(BigInteger.valueOf(j + 1));
            }

            BigInteger result = numerator.divide(denominator);
            System.out.println(result);
        }
        
        sc.close();
    }
}
