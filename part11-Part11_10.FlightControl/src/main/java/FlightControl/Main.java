package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlightControl FCTest = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(FCTest, scanner);
        ui.start();
    }
}
