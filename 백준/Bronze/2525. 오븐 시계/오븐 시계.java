import java.util.Scanner;

public class Main {

    public static void clock(int h, int m, int time) {

            if (h==24) {
                h=0;
            }

            int add_hour = 0;
            while (time >= 60) {
                time-=60;
                add_hour++;

        }
            h+=add_hour;
            if (h>=24) {
                h-=24;
            }
            m+=time;
            if (m>=60) {
                m-=60;
                h++;
                if (h>=24) {
                    h-=24;
                }
            }

        System.out.printf("%d %d",h,m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        clock(i,j,k);

    }
}