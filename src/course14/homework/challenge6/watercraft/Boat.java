package course14.homework.challenge6.watercraft;

public class Boat {

    private final double length;
    private final double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("The boat is " + length + "long, weights " + weight + " and is sailing on the sea.");
    }
}