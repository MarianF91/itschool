package course14.homework.challenge6.watercraft;

public class Boat {

    private double length;
    private double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("Sailing on the sea.");
    }
}