package course22.homework;

import java.util.Arrays;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = numbers.stream().
                reduce(0, (accumulator, number) -> accumulator + number);

        System.out.println("List of numbers: " + numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
