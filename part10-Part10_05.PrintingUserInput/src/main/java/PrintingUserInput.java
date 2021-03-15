
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty() || row.equals("\n")) {
                break;
            }
            inputList.add(row);
        }
        inputList.stream()
                .forEach(t -> System.out.println(t));
    }
}
