import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        int[] arr = new int[Range];
        float Max_Num = 0;
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
            if(Max_Num < arr[i]) {
                Max_Num = arr[i];
            }
        }
        float total = 0;
        for (int i = 0; i<arr.length; i++) {
            total += arr[i]/Max_Num*100;
        }
        System.out.println(total/Range);
    }
}