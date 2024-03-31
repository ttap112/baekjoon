import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> TotalArray = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            TotalArray.add(String.valueOf(i));
        }
        for (int i = 0; i < 28; i++) {
            String del = scan.next();
            TotalArray.remove(del);
        }
        for (int i = 0; i<2; i++) {
            System.out.print(TotalArray.get(i)+" ");
        }
    }
}