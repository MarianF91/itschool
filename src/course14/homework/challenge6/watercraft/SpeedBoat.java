package course14.homework.challenge6.watercraft;

public class SpeedBoat extends Boat {

    private final double maxSpeed;
    private final String engineType;

    public SpeedBoat(double length, double weight, double maxSpeed, String engineType){
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this. engineType = engineType;
    }

      @Override
    public void sail() {
          System.out.println("Sailing fast on the sea.");
          System.out.println("The boat has " + engineType + " engine type and " + maxSpeed + " max speed.");
    }

    public void turboBoost() {
        System.out.println("Turbo Boost is used for faster sailing.");
    }
}