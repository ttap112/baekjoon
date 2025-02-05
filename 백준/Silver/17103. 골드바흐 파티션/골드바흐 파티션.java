import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        int maxN = 0;
        int[] testCases = new int[T];
        
        // 테스트 케이스와 최대 N 값 받기
        for (int i = 0; i < T; i++) {
            testCases[i] = sc.nextInt();
            maxN = Math.max(maxN, testCases[i]);
        }

        // 에라토스테네스의 체로 소수 구하기
        boolean[] isPrime = new boolean[maxN + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= maxN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 각 테스트 케이스에 대해 골드바흐 파티션 개수 구하기
        for (int N : testCases) {
            int count = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
