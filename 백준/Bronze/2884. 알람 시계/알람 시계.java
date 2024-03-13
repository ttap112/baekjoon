import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int h = Scan.nextInt();
		int m = Scan.nextInt();
		
		if (m>=45) {
			m-=45;
		} else {
			m +=15;
			if (h==0) {
				h=23;
			} else {
				h-=1;
			}
		}
		System.out.printf("%d %d",h,m);
	}
}
