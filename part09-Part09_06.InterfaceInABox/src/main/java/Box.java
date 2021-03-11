
import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double sum = 0;
        for (Packable e : items) {
            sum += e.weight();
        }
        return (double) sum;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
