package course14.homework.challenge6.cars;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Standard car.", "Standard model.", 3000);
        System.out.println("This is for Car");
        car.characteristics();
        car.stop();
        car.accelerate();
        car.stop();

        ElectricCar electricCar = new ElectricCar("Electric Car", "Model Lightning", 3023,
                1000000, 300);
        System.out.println("\nThis is for ElectricCar");
        electricCar.characteristics();
        electricCar.start();
        electricCar.accelerate();
        electricCar.stop();
        electricCar.charge();

        Tesla tesla = new Tesla();
        System.out.println("\nThis is for Tesla");
        tesla.characteristics();
        tesla.charge();
        tesla.enableAutopilot();
        tesla.start();
        tesla.accelerate();
        tesla.stop();
    }
}