import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        for (int i = 0; i<Range; i++) {
            String text = scan.next();
            int Text_Le = text.length();
            String Fn = text.substring(0, 1);
            String Sn = text.substring(Text_Le-1);
            System.out.print(Fn);
            System.out.println(Sn);
        }
    }
}