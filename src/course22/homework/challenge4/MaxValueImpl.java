package course22.homework.challenge4;

import java.util.Arrays;
import java.util.List;

public class MaxValueImpl {
    public static void main(String[] args) {
        MaxValue finder = numbers -> numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer max = finder.findMax(numbers);
        System.out.println("Maximum value: " + max);
    }
}