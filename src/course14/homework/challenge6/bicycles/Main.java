package course14.homework.challenge6.bicycles;

public class Main {

    public static void main(String[] args) {

        Bicycle bike = new Bicycle();
        System.out.println("This is for bicycle.\n" + bike);
        bike.chars();
        bike.changeGear();
        bike.applyBrake();
        bike.speedUp();

        MountainBike mountainBike = new MountainBike();
        System.out.println("This is for mountainbike.\n" + mountainBike);
        mountainBike.chars();
        mountainBike.adjustSuspension();
        mountainBike.applyBrake();
        mountainBike.changeGear();
        mountainBike.speedUp();
    }
}