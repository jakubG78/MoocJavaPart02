
public class Hideout<T> {

    private T hidden;

    public Hideout() {
        hidden = null;
    }

    public void putIntoHideout(T toHide) {
        if (hidden == null) {
            this.hidden = toHide;
        }
    }

    public T takeFromHideout() {
        T result = hidden;
        hidden = null;
        return result;
    }

    public boolean isInHideout() {
        return hidden != null;
    }

}
