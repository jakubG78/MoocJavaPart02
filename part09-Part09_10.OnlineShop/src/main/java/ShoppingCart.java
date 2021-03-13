
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cartItemsMap;

    public ShoppingCart() {
        this.cartItemsMap = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cartItemsMap.keySet().contains(product)) {
            cartItemsMap.get(product).increaseQuantity();
        } else {
            cartItemsMap.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item e : cartItemsMap.values()) {
            totalPrice += e.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item e : cartItemsMap.values()) {
            System.out.println(e.toString());
        }
    }
}
