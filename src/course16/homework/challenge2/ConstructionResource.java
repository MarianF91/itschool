package course16.homework.challenge2;

public class ConstructionResource {

    private int cementBags;
    private int bricks;
    private double steel;
    private double wood;
    private double sandstone;
    private double faience;
    private double paint;

    public int getCementBags() {
        return cementBags;
    }

    public void setCementBags(int cementBags) {
        this.cementBags = cementBags;
    }

    public int getBricks() {
        return bricks;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    public double getSteel() {
        return steel;
    }

    public void setSteel(double steel) {
        this.steel = steel;
    }

    public double getWood() {
        return wood;
    }

    public void setWood(double wood) {
        this.wood = wood;
    }

    public double getSandstone() {
        return sandstone;
    }

    public void setSandstone(double sandstone) {
        this.sandstone = sandstone;
    }

    public double getFaience() {
        return faience;
    }

    public void setFaience(double faience) {
        this.faience = faience;
    }

    public double getPaint() {
        return paint;
    }

    public void setPaint(double paint) {
        this.paint = paint;
    }

    public void displayResources() {
        System.out.println("Cement bags: " + getCementBags());
        System.out.println("Number of bricks: " + getBricks());
        System.out.println("Steel (kg.): " + getSteel());
        System.out.println("Wood (cubic meters): " + getWood());
        System.out.println("Sandstone (square meters): " + getSandstone());
        System.out.println("Faience (square meters): " + getFaience());
        System.out.println("Paint (litres): " + getPaint());
    }
}