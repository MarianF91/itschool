package course20and21.challenge5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("White bread", 3, 123);
        Product product2 = new Product("Brown rice", 7, 123);

        System.out.println("Hashcode for product1: " + product1.hashCode());
        System.out.println("Hashcode for product2: " + product2.hashCode());
        System.out.println("Are objects equal? " + product1.equals(product2));
    }
}
