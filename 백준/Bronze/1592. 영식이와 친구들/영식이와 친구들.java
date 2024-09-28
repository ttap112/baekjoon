import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[] arr = new int[n];
		int answer = 0;
		int temp = 0;
		while(true) {
			if(arr[temp] % 2 == 1) {
				temp = (temp + l) % n;
				arr[temp]++;
				answer++;
			}
			else if(arr[temp] % 2 == 0) {
				temp = ((temp - l) + n) % n;
				arr[temp]++;
				answer++;
			}
			if(arr[temp] == m)
				break;
		}
		System.out.print(answer - 1);
	}
}