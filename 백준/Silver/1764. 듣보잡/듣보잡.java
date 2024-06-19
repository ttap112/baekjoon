import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        int n  = Integer.parseInt(st.nextToken());
        int rang = Integer.parseInt(st.nextToken());
        HashSet<String> arr = new HashSet<>();
        ArrayList<String> arr2 = new ArrayList<>();

        for (int i = 0; i<n; i++) {
            arr.add(sc.readLine());
        }
        for (int i = 0; i<rang; i++) {
            String s = sc.readLine();
            if (arr.contains(s)) {
                arr2.add(s);
            }
        }
        Collections.sort(arr2);
        System.out.println(arr2.size());
        for (String s : arr2) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}