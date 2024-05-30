import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Range = Integer.parseInt(br.readLine());
        HashSet<String> uniqueWords = new HashSet<>();
        ArrayList<String[]> textList = new ArrayList<>();

        for (int i = 0; i < Range; i++) {
            String text = br.readLine();
            if (uniqueWords.add(text)) {
                textList.add(new String[]{text, String.valueOf(text.length())});
            }
        }

        Collections.sort(textList, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int lengthCompare = Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                if (lengthCompare == 0) {
                    return o1[0].compareTo(o2[0]);
                }
                return lengthCompare;
            }
        });

        for (String[] text : textList) {
            bw.write(text[0] + "\n");
        }
        bw.flush();
    }
}
