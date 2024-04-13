import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer Sb = new StringBuffer(scan.next());
        String Text = Sb.toString();
        String reverse = Sb.reverse().toString();

        if (Text.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
