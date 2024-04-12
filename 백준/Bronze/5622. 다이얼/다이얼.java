import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Text = scan.next();
        String[] TextBox = new String[26];
        int[] NumList = new int[26];
        int TextBoxIndex = 0;
        int NumCount = 0;
        int NumAdd = 3;
        int Time = 0;
        for (int i = 65; i <= 90; i++) {
            TextBox[TextBoxIndex] = String.valueOf((char) i);
            TextBoxIndex++;
        }
        for (int i = 0; i < TextBox.length; i++) {
            for (int j = 0; j < 1; j++) {
                NumList[i] = NumAdd;
            }
            NumCount++;
            if (NumCount % 3 == 0) {
                NumAdd++;
            }
        }
        for (int i = 0; i < NumList.length; i++) {
            if (i == 18 && NumList[i] == 9) {NumList[i] = 8;}
            if (i == 21 && NumList[i] == 10) {NumList[i] = 9;}
            if (i == 24 && NumList[i] == 11) {NumList[i] = 10;}
            if (i == 25 && NumList[i] == 11) {NumList[i] = 10;}
        }
        for (int i = 0; i<Text.length(); i++) {
            for (int j = 0; j<TextBox.length; j++) {
                if (Text.substring(i, i + 1).equals(TextBox[j])) {
                    Time += NumList[j];
                }
            }
        }
        System.out.println(Time);
    }
}