package course18recap.challenge2;

public class Main {

    public static void main(String[] args) {

        Shape shape1 = new Shape("First shape", 3.1, 2.2);

        System.out.println("Perimeter is: " + shape1.perimeter());
        System.out.println("Area is: " + shape1.area());
    }
}