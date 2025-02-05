package course14.homework.challenge6.bicycles;

public class Bicycle {

    private double speed;
    private int gear;

    public Bicycle() {
        chars();
    }

    public void chars() {
        speed = 10;
        gear = 5;
    }

    public void changeGear() {
        System.out.println("The bike changes gears.");
    }

    public void speedUp() {
        System.out.println("The bike speeds up.");
    }

    public void applyBrake() {
        System.out.println("The bike rider applies breaks to slow down.");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}