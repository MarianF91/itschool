package course18recap.challenge8;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("The truck starts.");
    }

    @Override
    public void accelerate() {
        System.out.println("The truck accelerates.");
    }

    @Override
    public void stop() {
        System.out.println("The truck stops.");
    }
}
