import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        for (int i = 0; i < range; i++) {
            Stack<String> gwal = new Stack<>();
            char[] arr = sc.next().toCharArray();
            boolean isValid = true;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '(') {
                    gwal.push("(");
                } else {
                    if (gwal.empty()) {
                        isValid = false;
                        break;
                    } else {
                        gwal.pop();
                    }
                }
            }

            if (isValid && gwal.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
