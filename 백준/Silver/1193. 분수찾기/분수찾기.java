import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int num = 1;

        while (line > num) {
            line-=num;
            num++;
        }
        int a;
        int b;
        if (num%2==0) {
            a = line;
            b = num - line +1;
        } else {
            a = num - line + 1;
            b = line;
        }
        System.out.println(a+"/"+b);
    }
}