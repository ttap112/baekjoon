
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        int[][] Box = new int[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                Box[i][j] = 0;
            }
        }

        for (int i = 0; i<Range; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j<x+10; j++) {
                for (int k = y; k<y+10; k++) {
                    Box[j][k] = 1;
                }
            }
        }
        int Count = 0;

        for (int i = 0; i<100; i++) {
            for (int j = 0; j<100; j++) {
                if (Box[i][j] == 1) {
                    Count++;
                }
            }
        }
        System.out.println(Count);
    }
}