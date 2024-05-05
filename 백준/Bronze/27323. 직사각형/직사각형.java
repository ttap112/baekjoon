import java.util.Scanner;

public class Main{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int col = sc.nextInt();
        
        System.out.println(low*col);
    }
}