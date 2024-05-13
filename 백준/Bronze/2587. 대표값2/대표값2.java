import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] num = new int[5];
        for (int i = 0; i<5; i++) {
            arrayList.add(scanner.nextInt());
            num[i] = arrayList.get(i);
        }
        int Average = 0;
        Arrays.sort(num);
        for (int i : arrayList) {
            Average += i;
        }
        System.out.println(Average/5);
        System.out.println(num[2]);

    }
}
