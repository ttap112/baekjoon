import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Fn = scan.nextInt();
        int Sn = scan.nextInt();

        String jinsu = Integer.toString(Fn,Sn);
        System.out.println(jinsu.toUpperCase());
    }
}
