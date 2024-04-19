import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arr = new int[9][9];
        int MaxNum = 0;
        int low = 0;
        int col =0;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr.length; j++) {
                if (arr[i][j] > MaxNum) {
                    MaxNum = arr[i][j];
                    low = i;
                    col = j;
                }
            }
        }
        System.out.println(MaxNum);
        System.out.print((low+1)+" "+(col+1));
    }
}
