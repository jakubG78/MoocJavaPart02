
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        double maxValue = 0;
        for (double e : changeHistory) {
            if (e > maxValue) {
                maxValue = e;
            }
        }
        return maxValue;
    }

    public double minValue() {
//        if (changeHistory.isEmpty()) {
//            return 0;
//        }
        //double minValue = changeHistory.get(0);
        double minValue = changeHistory.get(0);        
        for (double e : changeHistory) {
            if (e < minValue) {
                minValue = e;
            }
        }
        return minValue;
    }

    public double average() {
        double sum = 0;
        for (double e : changeHistory) {
            sum += e;
        }
        return sum / changeHistory.size();
    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }

}
