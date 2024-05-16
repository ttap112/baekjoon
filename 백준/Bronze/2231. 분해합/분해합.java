import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String Number = scanner.next();

        for (int i = Integer.parseInt(Number); i>0; i--) {
            int totalNumber = i;
            int numberSum = 0;
            ArrayList<Integer> numList = new ArrayList<>();
            for (int j = 0; j<String.valueOf(i).length(); j++) {
                numList.add(Integer.parseInt(String.valueOf(i).substring(j,j+1)));
            }
            for (int num : numList) {
                numberSum += num;
            }
            if ( (totalNumber+numberSum) == Integer.parseInt(Number)) {
                arrayList.add(totalNumber);
            }
        }
        if (arrayList.isEmpty()) {
            System.out.println(0);
        } else {
            Integer[] sortArr = new Integer[arrayList.size()];
            arrayList.toArray(sortArr);
            Arrays.sort(sortArr);
            System.out.println(sortArr[0]);
        }
    }
}
