import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String text = "";
        
        for (int i = 0; i< a.length(); i++){
            b = a.charAt(i);
            if (Character.isUpperCase(b)) {
                text += Character.toLowerCase(b);
            } else {
                text += Character.toUpperCase(b);
            }
        }
        System.out.print(text);
    }
}