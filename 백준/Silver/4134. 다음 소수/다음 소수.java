import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        long[] inputs = new long[testCaseCount];
        
        for (int i = 0; i < testCaseCount; i++) {
            inputs[i] = scanner.nextLong();
        }
        
        for (long n : inputs) {
            System.out.println(findNextPrime(n));
        }
        
        scanner.close();
    }
    
    private static long findNextPrime(long n) {
        if (n <= 1) {
            return 2;
        }
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
    
    private static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
