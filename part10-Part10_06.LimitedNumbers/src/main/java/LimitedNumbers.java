
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            Integer inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber < 0) {
                break;
            }
            numbers.add(inputNumber);
        }
        numbers.stream()
                .filter(t -> t >= 1 && t <= 5)
                .forEach(t -> System.out.println(t));
    }
}
