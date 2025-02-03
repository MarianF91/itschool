package course14.homework.challenge6.watercraft;

public class FishingBoat extends Boat {

    protected double fishCapacity;
    protected String typeOfNet;

    public FishingBoat(double length, double weight, double fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    @Override
    public void sail() {

        System.out.println("Fishing on the sea.");
    }

    public void castNet() {
        System.out.println("Casting nets to catch fish.");
    }
}