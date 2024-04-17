import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int groupWordCount = 0;
        for (int i = 0; i < num; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }
        System.out.println(groupWordCount);
    }
    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prevChar = ' ';
        for (char currentChar : word.toCharArray()) {
            if (visited[currentChar - 'a'] && prevChar != currentChar) {
                return false;
            }
            visited[currentChar - 'a'] = true;
            prevChar = currentChar;
        }
        return true;
    }
}