import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int Range = scan.nextInt();
        for (int i = 0; i < Range; i++) {
            arr.add(scan.nextInt());
        }
        int Min_arr = arr.get(0); // 첫 번째 요소로 초기화
        int Max_arr = arr.get(0); // 첫 번째 요소로 초기화
        for (int j : arr) {
            if (Min_arr > j) {
                Min_arr = j;
            }
            if (Max_arr < j) {
                Max_arr = j;
            }
        }
        System.out.println(Min_arr + " " + Max_arr);
    }
}
