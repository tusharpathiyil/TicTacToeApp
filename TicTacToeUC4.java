import java.util.Scanner;

public class TicTacToeUC4 {

    // Method to convert slot to row & column
    public static int[] getPosition(int slot) {

        int index = slot - 1; // convert to 0-based

        int row = index / 3;
        int col = index % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        int[] position = getPosition(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}