
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            String command = "";
            int amount = 0;
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            System.out.print("> ");
            String input = scan.nextLine();
            System.out.println("");
            String[] inputPieces = input.split(" ");
            command = inputPieces[0];
            if (command.equals("quit")) {
                break;
            }
            switch (command) {
                case "add":
                    amount = Integer.valueOf(inputPieces[1]);
                    if (amount > 0) {
                        firstContainer.add(amount);
                    }
                    break;

                case "move":
                    amount = Integer.valueOf(inputPieces[1]);
                    if (amount > 0) {
                        if (amount <= firstContainer.contains()) {
                            firstContainer.remove(amount);
                            secondContainer.add(amount);
                        } else {
                            secondContainer.add(firstContainer.contains());
                            firstContainer.remove(amount);
                        }
                    }
                    break;

                case "remove":
                    amount = Integer.valueOf(inputPieces[1]);
                    if (amount > 0) {
                        secondContainer.remove(amount);
                    }
                    break;

                default:
                    System.out.println("Unknown command. Try again");
            }
        }
    }
}
