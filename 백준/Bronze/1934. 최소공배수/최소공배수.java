import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner NumberSet = new Scanner(System.in);

        int Range = NumberSet.nextInt();
        for (int i = 0; i < Range; i++) {
            int Fn = NumberSet.nextInt();
            int Sn = NumberSet.nextInt();

            int a = Fn;
            int b = Sn;
            
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int LCM = (Fn * Sn) / a;

            System.out.println(LCM);
        }
    }
}
