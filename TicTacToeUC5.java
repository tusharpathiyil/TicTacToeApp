public class TicTacToeUC5 {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move ✅");
        } else {
            System.out.println("Invalid Move ❌");
        }
    }
}