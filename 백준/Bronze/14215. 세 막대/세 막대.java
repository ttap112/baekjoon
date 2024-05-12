import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int FirstAngle = sc.nextInt();
        int SecondAngle = sc.nextInt();
        int ThirstAngle = sc.nextInt();
        
        if (FirstAngle+SecondAngle <= ThirstAngle) {
            System.out.println((FirstAngle+SecondAngle)*2-1);
        } else if (FirstAngle+ThirstAngle <= SecondAngle) {
            System.out.println((FirstAngle+ThirstAngle)*2-1);
        } else if (SecondAngle+ThirstAngle <= FirstAngle) {
            System.out.println((SecondAngle+ThirstAngle)*2-1);
        } else {
            System.out.println(FirstAngle+SecondAngle+ThirstAngle);
        }
    }
}