import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner NumberSet = new Scanner(System.in);

        String numberText = NumberSet.next();
        Integer[] arr = new Integer[numberText.length()];
        for (int i = 0; i<numberText.length(); i++) {
            numList.add(Integer.valueOf(numberText.substring(i,i+1)));
        }
        for (int i = 0; i<arr.length; i++) {
            arr[i] = numList.get(i);
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (Integer integer : arr) {
            System.out.print(integer);
        }
    }
}
