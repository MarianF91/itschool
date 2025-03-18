package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge16 {
    public static void main(String[] args) {
        TreeSet<Double> numbers = new TreeSet<>();
        numbers.add(1.2);
        numbers.add(7.1);
        numbers.add(0.0);
        numbers.add(-1.9);
        numbers.add(-7.1);
        numbers.add(7.2);
        numbers.add(7.3);
        numbers.add(7.0);

        double elementToBeRemoved = 7.0;

        System.out.println("Original TreeSet: " + numbers);
        System.out.println("Element to be removed: " + elementToBeRemoved);

        numbers.remove(elementToBeRemoved);

        System.out.println("New TreeSet: " + numbers);
    }
}
