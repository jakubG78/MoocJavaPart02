
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String input = scanner.nextLine();
                if (input.toLowerCase().equals("n")) {
                    double averageOfNegative = inputList.stream()
                            .mapToInt(t -> Integer.valueOf(t))
                            .filter(t -> t < 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the negative numbers: " + averageOfNegative);
                } else if (input.toLowerCase().equals("p")) {
                    double averageOfPositive = inputList.stream()
                            .mapToInt(t -> Integer.valueOf(t))
                            .filter(t -> t >= 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the positive numbers: " + averageOfPositive);
                }
                break;
            }
            inputList.add(row);
        }
    }
    
}
