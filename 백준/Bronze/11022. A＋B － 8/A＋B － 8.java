import java.util.Scanner;

public class Main {
    public static void Sum(int a, Scanner scan) {
        for (int i =0; i<a; i++) {
            int j = scan.nextInt();
            int k = scan.nextInt();
            System.out.printf("Case"+" #"+(i+1)+": "+j+" + "+k+" = "+(j+k));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Sum(i,scan);
    }
}