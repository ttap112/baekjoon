import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ChessSet = new int[] {1,1,2,2,2,8};
        int[] ChessList = new int[ChessSet.length];
        for (int i = 0; i<ChessList.length; i++) {
            ChessList[i] = scan.nextInt();
            ChessSet[i] -= ChessList[i];
        }
        for (int i = 0; i<ChessSet.length; i++) {
            System.out.print(ChessSet[i]+" ");
        }


    }
}