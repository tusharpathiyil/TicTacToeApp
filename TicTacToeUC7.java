import java.util.Random;

public class TicTacToeUC7 {

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    // Convert slot to position
    public static int[] getPosition(int slot) {
        int index = slot - 1;
        int row = index / 3;
        int col = index % 3;
        return new int[]{row, col};
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Computer random move
    public static void computerMove(char[][] board, char symbol) {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1; // 1–9
            int[] pos = getPosition(slot);

            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char computerSymbol = 'O';

        computerMove(board, computerSymbol);

        System.out.println("Board after computer move:");
        printBoard(board);
    }
}