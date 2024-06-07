import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> Company = new HashSet<>();
        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            String[] record = sc.readLine().split(" ");
            String name = record[0];
            String action = record[1];

            if (action.equals("enter")) {
                Company.add(name);
            } else if (action.equals("leave")) {
                Company.remove(name);
            }
        }

        List<String> presentEmployees = new ArrayList<>(Company);
        Collections.sort(presentEmployees, Collections.reverseOrder());

        for (String name : presentEmployees) {
            System.out.println(name);
        }
    }
}
