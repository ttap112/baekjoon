import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long X = sc.nextLong();

        long[] C = new long[N];
        long[] S = new long[M];

        for (int i = 0; i < N; i++) {
            C[i] = sc.nextLong();
        }

        for (int i = 0; i < M; i++) {
            S[i] = sc.nextLong();
        }

        Arrays.sort(C);
        Arrays.sort(S);

        int low = 0, high = Math.min(N, M), answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canHelp(mid, C, S, X)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }

    // Returns true if it is possible to help exactly `k` clubs
    public static boolean canHelp(int k, long[] C, long[] S, long X) {
        long needed = 0;

        // We need to check the largest `k` clubs
        for (int i = 0; i < k; i++) {
            long repairCost = C[i];
            long budget = S[S.length - k + i];
            if (budget < repairCost) {
                needed += repairCost - budget;
            }
        }

        return needed <= X;
    }
}
