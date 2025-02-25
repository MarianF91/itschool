package course18recap.challenge8;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        Truck newTruck = new Truck();
        Motorcycle newMotorcycle = new Motorcycle();

        newCar.start();
        newCar.accelerate();
        newCar.stop();
        System.out.println("===================================");

        newTruck.start();
        newTruck.accelerate();
        newTruck.stop();
        System.out.println("===================================");

        newMotorcycle.start();
        newMotorcycle.accelerate();
        newMotorcycle.stop();
        System.out.println("====================================");
        
    }
}
