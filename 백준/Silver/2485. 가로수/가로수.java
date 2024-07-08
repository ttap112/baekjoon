import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[] numList = new int[r];
        
        for (int i = 0; i < r; i++) {
            numList[i] = sc.nextInt();
        }
        
        Arrays.sort(numList);

        int[] gaps = new int[r - 1];
        for (int i = 0; i < r - 1; i++) {
            gaps[i] = numList[i + 1] - numList[i];
        }

        int gcdValue = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcdValue = gcd(gcdValue, gaps[i]);
        }
        
        int result = 0;
        for (int gap : gaps) {
            result += (gap / gcdValue) - 1;
        }
        
        System.out.println(result);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
