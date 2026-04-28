import java.util.Scanner;

public class TicTacToeUC8 {

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check win
    public static boolean checkWin(char[][] board, char symbol) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    // Check draw
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char currentPlayer = 'X';
        boolean gameRunning = true;

        while (gameRunning) {

            printBoard(board);
            System.out.print("Player " + currentPlayer + ", enter slot (1-9): ");
            int slot = scanner.nextInt();

            int index = slot - 1;
            int row = index / 3;
            int col = index % 3;

            // Validate move
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            // Place move
            board[row][col] = currentPlayer;

            // Check win
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins! 🎉");
                gameRunning = false;
            }

            // Check draw
            else if (isDraw(board)) {
                printBoard(board);
                System.out.println("Game is a draw!");
                gameRunning = false;
            }

            // Switch player
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }
}