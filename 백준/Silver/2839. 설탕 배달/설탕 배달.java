import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner NumberScan = new Scanner(System.in);

        int Number = NumberScan.nextInt();
        int Count = 0;

        while (Number > 0) {
            if (Number % 5 == 0) {
                Count += Number/5;
                break;
            } else {
                Number-= 3;
                Count++;
            }
            if (Number < 0 ) {
                Count = -1;
            }
        }
        System.out.println(Count);

    }
}
