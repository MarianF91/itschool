package course18recap.challenge8;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("The car starts.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates.");
    }

    @Override
    public void stop() {
        System.out.println("The car stops.");
    }
}
