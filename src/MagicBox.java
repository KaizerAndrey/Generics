import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    int filled = 0;

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled += 1;
                return true;
            }
        }
        return false;
    }
}
