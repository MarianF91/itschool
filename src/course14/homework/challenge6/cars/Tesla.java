package course14.homework.challenge6.cars;

public class Tesla extends ElectricCar {

    private String autopilotVersion;

    public Tesla() {
        super("Tesla", "Model Futuristic", 3050, 200000, 500);
    }

    public void enableAutopilot() {
        autopilotVersion = "Elon Musk updates autopilot.";
        System.out.println(autopilotVersion);
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "autopilotVersion='" + autopilotVersion + '\'' +
                ", " + super.toString() +
                '}';
    }
}