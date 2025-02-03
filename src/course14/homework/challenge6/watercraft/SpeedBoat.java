package course14.homework.challenge6.watercraft;

public class SpeedBoat extends Boat {

    protected double maxSpeed;
    protected String engineType;

    public SpeedBoat(double length, double weight, double maxSpeed, String engineType){
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this. engineType = engineType;
    }

      @Override
    public void sail() {
          System.out.println("Sailing fast on the sea.");
    }

    public void turboBoost() {
        System.out.println("Turbo Boost for faster sailing.");
    }
}