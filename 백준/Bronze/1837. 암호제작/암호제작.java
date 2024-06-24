import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[K+1];
        prime[1] = true;

        for(int i = 2; i < K; i++){
            if(prime[i])
                continue;

            BigInteger num = new BigInteger(Integer.toString(i));
            if(P.mod(num).compareTo(BigInteger.ZERO) == 0){
                System.out.println("BAD " + num);
                return;
            }
            for(int j = i + i; j <= K; j += i){
                prime[j] = true;
            }
        }

        str.append("GOOD");

        System.out.print(str);
        br.close();
    }
}