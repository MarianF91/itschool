package course12and13.homework.challenge4;

public class Objective {

    private double targetWeight;
    private double targetDistance;

    public double getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(double targetWeight) {
        this.targetWeight = targetWeight;
    }

    public double getTargetDistance() {
        return targetDistance;
    }

    public void setTargetDistance(double targetDistance) {
        this.targetDistance = targetDistance;
    }

    @Override
    public String toString() {
        return  " Target Weight: " + targetWeight +
                "\n  Target Distance: " + targetDistance;
    }
}