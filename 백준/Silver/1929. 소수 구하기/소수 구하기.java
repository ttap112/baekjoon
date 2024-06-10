import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int Fn = sc.nextInt();
        int Sn = sc.nextInt();
        
        
        for (int i = Fn; i <= Sn; i++) {
            arr.add(i);
        }
        
       
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (!isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
        
        
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
    
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
