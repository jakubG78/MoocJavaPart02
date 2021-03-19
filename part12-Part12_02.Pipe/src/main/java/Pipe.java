
import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> objects;

    public Pipe() {
        this.objects = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        objects.add(value);
    }

    public T takeFromPipe() {
        if (objects.isEmpty()) {
            return null;
        }
        int lastIndex = objects.size() - 1;
        T value = objects.get(lastIndex);
        objects.remove(lastIndex);
        return value;
    }

    public boolean isInPipe() {
        return !objects.isEmpty();
    }

}
