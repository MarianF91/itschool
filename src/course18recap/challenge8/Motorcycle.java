package course18recap.challenge8;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("The motorcycle starts.");
    }

    @Override
    public void accelerate() {
        System.out.println("The motorcycle accelerates.");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle stops.");
    }
}
