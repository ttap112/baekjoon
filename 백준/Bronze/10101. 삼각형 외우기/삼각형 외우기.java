import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int FirstAngle = sc.nextInt();
        int SecondAngle = sc.nextInt();
        int ThirstAngle = sc.nextInt();
        int TotalAngle = FirstAngle+SecondAngle+ThirstAngle;

        if (FirstAngle == SecondAngle && FirstAngle == ThirstAngle) {
            System.out.println("Equilateral");
        } else if (TotalAngle == 180 && FirstAngle == SecondAngle || SecondAngle == ThirstAngle || FirstAngle == ThirstAngle) {
            System.out.println("Isosceles");
        } else if (TotalAngle == 180) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}