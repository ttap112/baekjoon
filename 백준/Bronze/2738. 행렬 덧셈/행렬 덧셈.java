import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[low][col];
        int[][] arr2 = new int[low][col];
        ArrayAdd(arr,arr2, low, col,sc);
    }

    public static void ArrayAdd(int[][] arr, int[][] arr2, int low, int col, Scanner Scanner) {
        int[][] total = new int[low][col];
        for (int i = 0; i < low; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Scanner.nextInt();
            }
        }
        for (int i = 0; i < low; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = Scanner.nextInt();
            }
        }
        for (int i = 0; i < low; i++) {
            for (int j = 0; j < col; j++) {
                total[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i<low; i++) {
            for (int j = 0; j<col; j++) {
                System.out.print(total[i][j]+" ");
            }
            System.out.println();
        }
    }
}
