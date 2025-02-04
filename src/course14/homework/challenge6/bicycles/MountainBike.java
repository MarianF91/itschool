package course14.homework.challenge6.bicycles;

public class MountainBike extends Bicycle {

    private String tireType;
    private String suspension;

     public MountainBike() {
        super.chars();
        adjustSuspension();
    }

    public void adjustSuspension() {
        tireType = "King Size";
        suspension = "Sport";
    }

    @Override
    public void applyBrake() {
        System.out.println("This bike has better brakes.");
    }

    @Override
    public void changeGear() {
        System.out.println("This bike has more gears.");
    }

    @Override
    public void speedUp() {
        System.out.println("This bike goes faster.");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "tireType='" + tireType + '\'' +
                ", suspension='" + suspension + '\'' +
                '}';
    }
}