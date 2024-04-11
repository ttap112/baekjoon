import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NumRange = scan.nextInt();                                  // 수열의 길이
        int[] NumArr = new int[NumRange];                               // 수열의 배열

        for (int i = 0; i < NumArr.length; i++) {                       // 길이 만큼 반복해서
            NumArr[i] = scan.nextInt();                                 // 값 넣기
        }

        Stack<Integer> stack = new Stack<>();                           // 스택 생성
        ArrayList<String> AccountText = new ArrayList<>();              // +,-를 저장하기 위한 배열 생성

        int Number = 1;                                                 // 수열과 비교하기 위한 변수 생성

        String bool = null;                                             // 수열이 출력이 되는지 확인을 위한 변수

        for (int i = 0; i < NumArr.length; i++) {                       // 수열의 길이만큼 반복
            if (NumArr[i] >= Number) {                                  // 수열이 Number 보다 크거나 같을 경우
                while (NumArr[i] >= Number) {                           // 반복하여 Number 가 크거나 같아질때까지 반복
                    stack.push(Number++);                               // push하여 스택에 수를 추가 후 Number 값 증가
                    AccountText.add("+");                               // push한 만큼 +를 AccountText에 +를 저장
                }
                stack.pop();                                            // 반복문을 나가면 값이 같아 지기에 pop을 함
                AccountText.add("-");                                   // pop한 뒤에 AccountText에 -를 저장
            } else {                                                    // Number가 수열보다 클 경우
                if (!stack.isEmpty() && stack.peek() == NumArr[i]) {    // 스택이 비어있지 않고 팝한 값이 수열이랑 같을 경우
                    stack.pop();                                        // 스택을 팝 한 뒤
                    AccountText.add("-");                               // AccountText에 -를 저장
                } else {                                                // 그게 아니라면
                    bool = "NO";                                        // bool에 NO 저장
                }
            }
        }
        if (bool == "NO") {                                             // 만약 bool이 NO라면
            System.out.println(bool);                                   // NO를 출력
        } else {                                                        // 그게 아니면
            for (int i = 0;  i<AccountText.size(); i++) {               // AccountText에 있는 값들 출력
                System.out.print(AccountText.get(i)+" ");
            }
        }
    }
}