import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Range = sc.nextInt();

        int minCol = 0;
        int MaxCol = 0;

        int minRow = 0;
        int MaxRow = 0;

        int breaker = 0;

        for (int i = 0; i<Range; i++) {
            int col = sc.nextInt();
            int row = sc.nextInt();

            if (breaker == 0) {
                minRow = row;
                MaxRow = row;
                minCol = col;
                MaxCol = col;
                breaker++;
            }

            if (minCol > col) {
                minCol = col;
            }
            if (MaxCol < col) {
                MaxCol = col;
            }
            if (minRow > row) {
                minRow = row;
            }
            if (MaxRow < row) {
                MaxRow = row;
            }

        }
        System.out.println((MaxCol-minCol)*(MaxRow-minRow));
    }
}