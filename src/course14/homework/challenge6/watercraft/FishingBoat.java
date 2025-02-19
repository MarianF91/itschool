package course14.homework.challenge6.watercraft;

public class FishingBoat extends Boat {

    private final double  fishCapacity;
    private final String typeOfNet;

    public FishingBoat(double length, double weight, double fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    @Override
    public void sail() {

        System.out.println("Fishing on the sea.");
        System.out.println("The boat uses " + typeOfNet + " and has " + fishCapacity + " fish capacity.");
    }

    public void castNet() {
        System.out.println("Casting nets to catch fish.");
    }
}