import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Fn = scan.next();
        String Sn = scan.next();
        StringBuffer fn = new StringBuffer(Fn);
        String reverse = fn.reverse().toString();
        StringBuffer sn = new StringBuffer(Sn);
        String reverse2 = sn.reverse().toString();

        Integer fn1 = Integer.valueOf(String.valueOf(fn));
        Integer sn1 = Integer.valueOf(String.valueOf(sn));
        if (fn1 > sn1) {
            System.out.println(fn1);
        } else {
            System.out.println(sn1);
        }
    }
}
