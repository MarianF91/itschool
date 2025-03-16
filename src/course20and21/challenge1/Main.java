package course20and21.challenge1;

public class Main {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(3, 4);
        Rectangle secondRectangle = new Rectangle(3, 4);

        System.out.println("Hashcode for firstRectangle: " + firstRectangle.hashCode());
        System.out.println("Hashcode for secondRectangle: " + secondRectangle.hashCode());
        System.out.println("Are objects equal? " + firstRectangle.equals(secondRectangle));

    }
}
