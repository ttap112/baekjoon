import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter sout = new BufferedWriter(new OutputStreamWriter(System.out));

        int range = Integer.parseInt(sc.readLine());
        String[][] DBHumanList = new String[range][2];

        for (int i = 0; i < DBHumanList.length; i++) {
            String[] textInput = sc.readLine().split(" ");
            DBHumanList[i][0] = textInput[0];
            DBHumanList[i][1] = textInput[1];
        }

        Arrays.sort(DBHumanList, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        for (String[] strings : DBHumanList) {
            sout.write(strings[0] + " " + strings[1]);
            sout.newLine();
        }

        sc.close();
        sout.flush();
        sout.close();
    }
}
