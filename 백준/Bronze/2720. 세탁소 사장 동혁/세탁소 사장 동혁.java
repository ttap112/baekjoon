import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        AccountMoney(Range,sc);

    }
    public static void AccountMoney (int Range, Scanner Scanner) {
        ArrayList<ArrayList<Integer>> MoneyList = new ArrayList<>();
        for (int i = 0; i < Range; i++) {
            MoneyList.add(new ArrayList<>());
        }
        int Quarter = 25;
        int Dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < Range; i++) {
            int Money = Scanner.nextInt();
            while (Money > 0) {
                int Count = 0;
                while (Money >= Quarter) {
                    Money -= Quarter;
                    Count ++;
                }
                MoneyList.get(i).add(Count);
                Count = 0;
                while (Money >= Dime) {
                    Money -= Dime;
                    Count++;
                }
                MoneyList.get(i).add(Count);
                Count = 0;
                while (Money >= nickel) {
                    Money -= nickel;
                    Count++;
                }
                MoneyList.get(i).add(Count);
                Count = 0;
                while (Money >= penny) {
                    Money -= penny;
                    Count++;
                }
                MoneyList.get(i).add(Count);
            }
        }
        for (int i = 0; i<MoneyList.size(); i++) {
            for (int j = 0; j<MoneyList.get(i).size(); j++) {
                System.out.print(MoneyList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
