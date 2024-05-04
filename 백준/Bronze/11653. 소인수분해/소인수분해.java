import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();

        int Sq = 2;
        while (Num > 1) {
            if (Num%Sq == 0) {
                Num/=Sq;
                System.out.println(Sq);
            } else {
                Sq++;
            }
        }
    }
}
