import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> strList = new HashSet<>();
        String inputText = sc.next();

        for (int i = 0; i<inputText.length(); i++) {
            for (int j = i+1; j<=inputText.length(); j++) {
                strList.add(inputText.substring(i,j));
            }
        }
        System.out.println(strList.size());
    }
}