import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();                     // Xcm인 막대기
        int Main_Stick = 64;                        // 지민이가 가지고 있는 막대기
        int Count = 0;                              // 막대기 갯수 세기

        while (x > 0) {                             // Xcm 구하기 위해 X가 0이 될때까지 반복
            if (Main_Stick > x) {                   // 가지고 있는 막대가 x 보다 크면
                Main_Stick/=2;                      // 절반을 나눔
            } else {                                // 그게 아니면
                Count++;                            // Count(막대기의 수) 증가한 뒤
                x-=Main_Stick;                      // 나눈 막대기의 값과 x 값을 뺀 뒤 다시 반복
            }
        }
        System.out.println(Count);                  // 총 필요한 막대기의 수 출력
    }
}