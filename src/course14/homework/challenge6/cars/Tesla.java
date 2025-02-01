package course14.homework.challenge6.cars;

public class Tesla extends ElectricCar{

    private String autopilotVersion;

    @Override
    public void characteristics() {
        super.characteristics();
        enableAutopilot();
    }

    private void enableAutopilot(){
        autopilotVersion = "Autopilot updated.";
        System.out.println(autopilotVersion);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void charge() {
        super.charge();
    }
}