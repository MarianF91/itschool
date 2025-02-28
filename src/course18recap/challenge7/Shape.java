package course18recap.challenge7;

public abstract class Shape {

    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public String getName() {
        return name;
    }
}
