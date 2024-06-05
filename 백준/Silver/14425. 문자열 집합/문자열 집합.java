import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> sSet = new HashSet<>();
        int n = sc.nextInt(); 
        int m = sc.nextInt();

        int totalCount = 0; 

       
        for (int i = 0; i < n; i++) {
            sSet.add(sc.next());
        }

        
        for (int i = 0; i < m; i++) {
            String testStr = sc.next();
            
            if (sSet.contains(testStr)) {
                totalCount++;
            }
        }

        System.out.println(totalCount);
    }
}