import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int Num = scan.nextInt();
        System.out.println(name.charAt(Num-1));
    }
}



