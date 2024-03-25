import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        int[] arr = new int[Range];
        int Count = 0;
        for (int i = 0; i<Range; i++) {
            arr[i] = scan.nextInt();
        }
        int Num_Count = scan.nextInt();
        for (int j = 0; j<arr.length; j++) {
            if (Num_Count == arr[j]) {
                Count++;
            }
        }
        System.out.println(Count);
    }
}