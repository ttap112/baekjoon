import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> TextLeading = new ArrayList<>();
        ArrayList2D(TextLeading);
    }
    public static void ArrayList2D (ArrayList<ArrayList<String>> TextLeading) {
        Scanner sc = new Scanner(System.in);
        int Range = 5;
        int low = 0;
        int maxLength = 0;
        for (int i = 0; i < Range; i++) {
            TextLeading.add(new ArrayList<>());
        }
        while (Range > 0) {
            String Text = sc.next();
            while (true) {
                if (Text.length() <= 15 && !Text.isEmpty()) {
                    break;
                } else {
                    Text = sc.next();
                }
            }
            for (int i = 0; i<Text.length(); i++) {
                TextLeading.get(low).add(Text.substring(i,i+1));
            }
            maxLength = Math.max(maxLength, Text.length());
            low++;
            Range--;
        }
        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < TextLeading.get(i).size()) {
                    System.out.print(TextLeading.get(i).get(j) + "");
                }
            }
        }
    }
}