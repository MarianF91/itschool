package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge14 {
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

        System.out.println("TreeSet: " + numbers);
        System.out.println("First Element: " + numbers.getFirst());
    }
}
