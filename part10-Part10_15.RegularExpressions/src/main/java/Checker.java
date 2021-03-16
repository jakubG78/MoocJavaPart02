
public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.toLowerCase().matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    public boolean allVowels(String string) {
        return string.toLowerCase().matches("(a|e|i|o|u)*");
    }

    public boolean timeOfDay(String string) {
        if (string.length() == 8) {
            return string.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        }
        return false;
    }
}
