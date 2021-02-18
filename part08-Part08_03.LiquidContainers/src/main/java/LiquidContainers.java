
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            String command = "";
            int amount = 0;
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            System.out.println("");
            String[] inputPieces = input.split(" ");
            command = inputPieces[0];
            if (command.equals("quit")) {
                break;
            }
            amount = Integer.valueOf(inputPieces[1]);
            switch (command) {
                case "add":
                    if (amount > 0) {
                        firstContainer += amount;
                    }
                    if (firstContainer > 100) {
                        firstContainer = 100;
                    }
                    break;

                case "move":
                    if (amount > 0) {
                        if (amount <= firstContainer) {
                            firstContainer -= amount;
                            secondContainer += amount;
                        } else {
                            secondContainer += firstContainer;
                            firstContainer = 0;
                        }
                    }

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                    break;

                case "remove":
                    if (amount > 0) {
                        if (amount <= secondContainer) {
                            secondContainer -= amount;
                        } else {
                            secondContainer = 0;
                        }
                    }
                    break;

                default:
                    System.out.println("Unknown command. Try again");
            }
        }
    }
}
