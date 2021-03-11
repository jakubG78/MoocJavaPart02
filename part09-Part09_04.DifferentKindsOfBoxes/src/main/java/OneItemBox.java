
public class OneItemBox extends Box {

    private Item content;

    public OneItemBox() {
        this.content = new Item(null);
    }

    @Override
    public void add(Item item) {
        if (content.getName() == null) {
            this.content = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.content.equals(item);
    }

}
