import java.util.Scanner;

public class Main{

    public static void Sum(int a) {
        int b = 0;
        for (int i = 1; i<=a; i++) {
            b+=i;
        }

        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        Sum(i);
        
    }
}