import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            // 약수를 담기 위한 리스트
            List<Integer> divisorList = new ArrayList<>();
            // 약수들의 합
            int sum = 0;

            // 리스트에 약수들을 담으면서 합 구하기
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisorList.add(i);
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n);
            // 완전수인 경우
            if (sum == n) {
                sb.append(" = ");

                for (int i : divisorList) {
                    sb.append(i).append(" + ");
                }

                sb.delete(sb.length() - 3, sb.length());
            // 완전수가 아닌 경우
            } else {
                sb.append(" is NOT perfect.");
            }

            System.out.println(sb);
        }
    }
}