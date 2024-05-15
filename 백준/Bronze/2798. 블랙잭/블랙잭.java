import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] NumberList = new int[sc.nextInt()];
        int FoundNumber = sc.nextInt();
        int ArrNumAdd = 0;

        for (int i = 0; i<NumberList.length; i++) {
            NumberList[i]= sc.nextInt();
        }
        for (int i = 0; i<NumberList.length; i++) {
            for (int j  = i+1; j<NumberList.length; j++) {
                for (int k = j+1; k<NumberList.length; k++) {
                    int temp = NumberList[i]+NumberList[j]+NumberList[k];
                    if (temp <= FoundNumber && temp > ArrNumAdd) {
                        ArrNumAdd = temp;
                    }
                }
            }
        }
        System.out.println(ArrNumAdd);
    }
}
