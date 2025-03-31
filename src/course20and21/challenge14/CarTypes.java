package course20and21.challenge14;

public enum CarTypes {
    MIURA ("Miura", "Lamborghini", 1500),
    GOLF ("Golf", "Volkswagen", 2500),
    BATMOBILE ("Batmobile", "Dacia", 99999);

    private final String typeName;
    private final String manufacturer;
    private final int averagePrice;

    CarTypes(String typeName, String manufacturer, int averagePrice) {
        this.typeName = typeName;
        this.manufacturer = manufacturer;
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return typeName + " (Produced by: " + manufacturer + "), Average Price: $" + averagePrice;
    }

    public static void main(String[] args) {
        for (CarTypes carType : CarTypes.values()) {
            System.out.println(carType);
        }
    }

}
