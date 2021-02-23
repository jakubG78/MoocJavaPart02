
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debtDatabase;

    public IOU() {
        this.debtDatabase = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtDatabase.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debtDatabase.getOrDefault(toWhom, 0.0);
    }
}
