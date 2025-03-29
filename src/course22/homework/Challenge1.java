package course22.homework;

import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream().
                filter(number -> number % 2 == 0).toList();

        System.out.println("Even numbers: " + evenNumbers);
    }
}
