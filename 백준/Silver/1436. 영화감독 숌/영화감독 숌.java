import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner NumberScan = new Scanner(System.in);

        int Number = NumberScan.nextInt();
        int CountNumber = 1;
        int badNumber = 666;
        while (CountNumber != Number) {
            badNumber++;
            if (String.valueOf(badNumber).contains("666")) {
                CountNumber++;
            }
        }
        System.out.println(badNumber);



    }
}
