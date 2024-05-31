import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            arr2[i] = set.contains(num) ? 1 : 0;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
