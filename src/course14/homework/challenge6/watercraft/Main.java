package course14.homework.challenge6.watercraft;

public class Main {

    public static void main(String[] args) {

        Boat boat = new Boat(20, 1500);
        System.out.println("This is for boat");
        boat.sail();

        FishingBoat fishingBoat = new FishingBoat(30, 2000, 500, "Netty net");
        System.out.println("\nThis is fo fishing boat");
        fishingBoat.sail();
        fishingBoat.castNet();

        SpeedBoat speedBoat = new SpeedBoat(20, 1500, 80, "V8");
        System.out.println("\n This is for speed boat");
        speedBoat.sail();
        speedBoat.turboBoost();
    }
}