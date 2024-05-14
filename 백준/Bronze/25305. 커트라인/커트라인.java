import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer [] arr =new Integer[scanner.nextInt()];

        int Choice_Human = scanner.nextInt()-1;

        for (int i = 0; i<arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[Choice_Human]);

    }
}
