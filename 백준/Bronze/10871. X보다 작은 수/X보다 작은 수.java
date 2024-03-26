import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        int Min_Number = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i<Range; i++) {
            arr.add(scan.nextInt());

        }
        for (int j : arr) {
            if (Min_Number > j) {
                arr2.add(j);
            }
        }
        for (int k : arr2) {
            System.out.print(k+" ");
        }
    }
}