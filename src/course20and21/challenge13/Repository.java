package course20and21.challenge13;

import java.util.HashMap;
import java.util.Map;

public class Repository<T> {
    private final Map<Object, T> stuff = new HashMap<>();

    public void add(Object key, T value) {
        stuff.put(key, value);
    }

    public T get(Object key) {
        return stuff.get(key);
    }

    public void remove(Object key) {
        stuff.remove(key);
    }

    public int size() {
        return stuff.size();
    }
}
