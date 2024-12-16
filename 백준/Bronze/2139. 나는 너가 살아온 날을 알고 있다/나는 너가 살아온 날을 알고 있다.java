import java.util.Scanner;

public class Main {
    // 윤년 여부를 판단하는 메서드
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 각 월의 일수를 저장한 배열
    public static int[] getDaysInMonths(int year) {
        // 윤년이면 2월이 29일, 아니면 28일
        return isLeapYear(year)
                ? new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
                : new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public static int calculateDayOfYear(int day, int month, int year) {
        int[] daysInMonths = getDaysInMonths(year);
        int totalDays = 0;

        // 이전 달까지의 모든 일수를 더함
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonths[i];
        }

        // 현재 달의 일수를 더함
        totalDays += day;

        return totalDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 입력받기
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            // 종료 조건
            if (day == 0 && month == 0 && year == 0) {
                break;
            }

            // 결과 출력
            System.out.println(calculateDayOfYear(day, month, year));
        }

        scanner.close();
    }
}
