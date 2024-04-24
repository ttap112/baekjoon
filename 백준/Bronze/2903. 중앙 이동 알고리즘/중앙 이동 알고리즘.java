import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int low = 2;
        int col = 2;
        for (int i = 0; i<range; i++) {
            double add_arr = Math.pow(2,i);
            low += (int) add_arr;
            col += (int) add_arr;
        }
        System.out.println(low*col);
    }
}