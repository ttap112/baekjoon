import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i<10; i++) {
			arr.add(scan.nextInt()%42);
		}
		for (int i = 0; i<arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--; 
                }
            }
        }
		System.out.println(arr.size());
	}
}
