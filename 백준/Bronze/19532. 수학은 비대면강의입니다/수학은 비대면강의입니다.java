import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner NumberScan = new Scanner(System.in);
        int[][] multiDimensionalArray = new int[2][3];
        for (int i = 0; i< multiDimensionalArray.length; i++) {
            for (int j = 0; j<multiDimensionalArray[i].length; j++) {
                multiDimensionalArray[i][j] = NumberScan.nextInt();
            }
        }
        for (int i = -999; i<1000; i++) {
            for (int j = -999; j<1000; j++) {
                if ((multiDimensionalArray[0][0]*i) + (multiDimensionalArray[0][1] * j) == multiDimensionalArray[0][2]
                && (multiDimensionalArray[1][0]*i) + (multiDimensionalArray[1][1] * j) == multiDimensionalArray[1][2]) {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
