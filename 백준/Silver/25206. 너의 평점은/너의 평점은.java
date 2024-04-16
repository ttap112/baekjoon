import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> SubjectName = new ArrayList<>();
        ArrayList<Double> Credit = new ArrayList<>();
        ArrayList<String> Grade = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (i <= 20) {
            String Text = br.readLine();
            String[] TextList = Text.split(" ");
            SubjectName.add(TextList[0]);
            Credit.add((double) Float.parseFloat(TextList[1]));
            Grade.add(TextList[2]);
            i++;
        }
        TotalAvg(Credit, Grade);
    }


    public static void TotalAvg(ArrayList<Double> credit, ArrayList<String> grade) {
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        double totalSum = 0;
        double scoreSum = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (Objects.equals(grade.get(i), gradeList[j])) {
                    totalSum +=  credit.get(i) * gradeScore[j];
                    if (j != 9) {
                        scoreSum += credit.get(i);
                    }
                }
            }


        }
        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);
    }
}