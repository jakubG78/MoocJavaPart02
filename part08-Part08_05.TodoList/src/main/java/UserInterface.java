
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            switch (input) {
                case "add":
                    System.out.print("To add: ");
                    input = scanner.nextLine();
                    list.add(input);
                    break;
                
                case "list":
                    list.print();
                    break;
                
                case "remove":
                    System.out.print("Which one is removed? ");
                    int readedIndex = Integer.valueOf(scanner.nextLine());
                    list.remove(readedIndex);
                    break;
                default:
                    System.out.println("Unknown command. Try again.");
            }
            
        }
    }
}
