package course20and21.challenge11;

public class Pair<T, K> {
    private final T firstElement;
    private final K secondElement;

    public Pair(T firstElement, K secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    @Override
    public String toString() {
        return "Pair: " +
                "\n- first element = " + firstElement +
                "\n- second element = " + secondElement;
    }
}
