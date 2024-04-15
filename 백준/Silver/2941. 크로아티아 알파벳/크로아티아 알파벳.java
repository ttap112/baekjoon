import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String text = scan.next();
        int count = countCroatianAlphabets(text, croatianAlphabets);
        System.out.println(count);
    }

    private static int countCroatianAlphabets(String text, String[] croatianAlphabets) {
        int count = 0;
        int index = 0;
        while (index < text.length()) {
            boolean found = false;
            for (String croatian : croatianAlphabets) {
                if (text.startsWith(croatian, index)) {
                    count++;
                    index += croatian.length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
                index++;
            }
        }
        return count;
    }
}
