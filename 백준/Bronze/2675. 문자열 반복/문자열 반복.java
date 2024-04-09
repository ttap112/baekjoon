import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Range = scan.nextInt();
        for (int i = 0; i<Range; i++) {
            int Num = scan.nextInt();
            String Text = scan.next();
            for (int j = 0; j<Text.length(); j++) {
                for (int k = 0; k<Num; k++) {
                    System.out.print(Text.substring(j,j+1));
                }
            }
            System.out.println(" ");
        }
    }
}
