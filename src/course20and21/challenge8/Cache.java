package course20and21.challenge8;

import java.util.Objects;

public class Cache {
    private final String name;
    private final int id;

    public Cache(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Cache that = (Cache) object;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cache{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
