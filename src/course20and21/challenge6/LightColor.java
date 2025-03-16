package course20and21.challenge6;

public enum LightColor {
    RED ("Stop", 30),
    YELLOW ("Wait", 5),
    GREEN ("Go", 45);

   private final String description;
   private final int duration;

    LightColor(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}
