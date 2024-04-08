import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        String Text_Num = scan.next();
        int[] Text_list = new int[Range];
        int total = 0;

        for (int i = 0; i<Range; i++) {
            Text_list[i] = Integer.parseInt(Text_Num.substring(i,i+1));
            total += Text_list[i];
        }
        System.out.println(total);
    }
}