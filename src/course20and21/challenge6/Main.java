package course20and21.challenge6;

public class Main {
    public static void main(String[] args) {
        LightColor red = LightColor.RED;
        LightColor yellow = LightColor.YELLOW;
        LightColor green = LightColor.GREEN;

        System.out.println("Red: " + "\n- " + red.getDuration() + ";\n- " + red.getDescription());
        System.out.println("Yellow: " + "\n- " + yellow.getDuration() + ";\n- " + yellow.getDescription());
        System.out.println("Green: " + "\n- " + green.getDuration() + ";\n- " + green.getDescription());
    }
}
