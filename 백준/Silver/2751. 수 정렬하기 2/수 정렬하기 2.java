import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberRange = Integer.parseInt(br.readLine());
        int[] numList = new int[numberRange];

        for (int i = 0; i<numberRange; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(numList);
        for (int i = 0; i<numberRange; i++) {
            bw.write(String.valueOf(numList[i]));
            bw.newLine();
        }
        bw.close();

    }
}