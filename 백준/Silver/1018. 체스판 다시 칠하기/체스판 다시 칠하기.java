import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine();

        char[][] board = new char[row][col];

        // 체스판 입력 받기
        for (int i = 0; i < row; i++) {
            String inputLine = scanner.nextLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = inputLine.charAt(j);
            }
        }
        int minChange = Integer.MAX_VALUE;
        
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                minChange = Math.min(minChange, findMinChange(board, i, j));
            }
        }
        System.out.println(minChange);
    }

    private static int findMinChange(char[][] board, int startRow, int startCol) {
        int endRow = startRow + 8;
        int endCol = startCol + 8;
        int changeCount = 0; // 수정 횟수

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                char expectedColor = ((i + j) % 2 == 0) ? 'W' : 'B';
                if (board[i][j] != expectedColor) changeCount++;
            }
        }
        
        return Math.min(changeCount, 64 - changeCount);
    }
}
