
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item e : items) {
            sum += e.getWeight();
        }
        if (sum + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
