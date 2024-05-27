import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Range = Integer.parseInt(br.readLine());
        int[][] numList = new int[Range][2];

        for (int i = 0; i < Range; i++) {
            String[] input = br.readLine().split(" ");
            numList[i][0] = Integer.parseInt(input[0]);
            numList[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(numList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < numList.length; i++) {
            bw.write(numList[i][0] + " " + numList[i][1]);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
