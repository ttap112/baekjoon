import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        int Max_Number = 0;
        int count = 0;
        for (int i = 0; i<arr.length; i++) {
            arr[i]= scan.nextInt();
            
            if (arr[i] > Max_Number) {
                Max_Number = arr[i];
                count = i+1;
            }
        }
        System.out.println(Max_Number);
        System.out.println(count);
    }
}