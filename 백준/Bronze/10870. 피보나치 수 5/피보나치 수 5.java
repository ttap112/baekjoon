import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 10870번
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            
            System.out.println(Fibonacci(input));
            
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
    private static int Fibonacci(int num) {
        if (num ==0) {
            return 0;
        }
        if (num ==1) {
            return 1;
        }
        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}
