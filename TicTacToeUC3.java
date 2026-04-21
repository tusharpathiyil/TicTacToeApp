import java.util.Scanner;

public class TicTacToeUC3 {

    // Method to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int slot = getUserInput();

        System.out.println("You selected slot: " + slot);
    }
}