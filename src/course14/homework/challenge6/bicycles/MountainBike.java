package course14.homework.challenge6.bicycles;

public class MountainBike extends Bicycle{

    private String tireType;
    private String suspension;

    @Override
    public void chars() {
        super.chars();
    }

    public void adjustSuspension(){
    tireType = "King Size";
    suspension = "Sport";
    }

    @Override
    public void applyBrake() {
        super.applyBrake();
    }

    @Override
    public void changeGear() {
        super.changeGear();
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }
}
