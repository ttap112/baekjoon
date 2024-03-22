import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());

        for (int j = 0; j<i; j++) {
            String[] Total = br.readLine().split(" ");
            int Fn = Integer.parseInt(Total[0]);
            int Sn = Integer.parseInt(Total[1]);

            bw.write(String.valueOf(Fn + Sn));
            bw.newLine();
        }
        bw.flush();
    }
}