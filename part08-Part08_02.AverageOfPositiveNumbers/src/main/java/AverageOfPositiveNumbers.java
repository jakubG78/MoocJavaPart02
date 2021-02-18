
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositiveNumbers = 0;
        int counter = 0;
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == 0) {
                break;
            } else if (inputNumber > 0) {
                sumOfPositiveNumbers += inputNumber;
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double averageOfPositiveNumbers = 1.0 * sumOfPositiveNumbers / counter;
            System.out.println(averageOfPositiveNumbers);
        }

    }
}
