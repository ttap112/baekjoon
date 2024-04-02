import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int range = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < range; i++) {
            int Fn = scan.nextInt()-1;
            int Sn = scan.nextInt()-1;
            while (Fn<Sn) {
                int Tn = 0;
                Tn = arr[Fn];
                arr[Fn] = arr[Sn];
                arr[Sn] = Tn;
                Fn++;
                Sn--;
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}



