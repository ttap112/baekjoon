import java.util.Scanner;

public class Main {

    public static void gugudan(int a) {
        for (int i=1; i<10; i++) {
            System.out.println(a+" "+"*"+" "+i+" "+"="+" "+(a*i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        gugudan(number);
    }
}