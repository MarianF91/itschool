package course18recap.challenge3;

public class Main {

    public static void main(String[] args) {

        Car firstCar = new Car("Tesla", "muskian", "yellow", 2030);

        System.out.println(firstCar.start());
        System.out.println(firstCar.accelerate());
        System.out.println(firstCar.brake());
    }
}
