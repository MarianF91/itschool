package course19.homework.treeset;

import java.util.TreeSet;

public class Challenge8 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        TreeSet<String> numbers = new TreeSet<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");

        System.out.println("First TreeSet: " + colors);
        System.out.println("Second TreeSet: " + numbers);
        System.out.println("Are sets equal? " + colors.equals(numbers));
    }
}
