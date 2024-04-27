import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int climbing = Integer.parseInt(input[0]);
        int getOff = Integer.parseInt(input[1]);
        int totalLength = Integer.parseInt(input[2]);

        int count = (totalLength - getOff - 1) / (climbing - getOff) + 1;

        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}
