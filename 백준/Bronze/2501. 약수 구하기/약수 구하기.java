import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList arrayList = new ArrayList();

        for(int i=1; i<=N; i++){
            if(N%i==0){
                arrayList.add(i);
            }
        }

        try{
            System.out.println(arrayList.get(K-1));
        }
        catch (Exception e){
            System.out.println(0);
        }
    }
}