package course20and21;

import java.util.Arrays;

public class Challenge10 {
    public static void main(String[] args) {
    Integer[] numbers = {1, 2, 3};
    Character[] letters = {'a', 'b', 'c'};
        System.out.println("Numbers array: " + Arrays.toString(numbers));
        System.out.println("Char array: " + Arrays.toString(letters));

        elementSwap(numbers, 0,2);
        elementSwap(letters, 0,1);

        System.out.println("Swapped arrays: " + "\n- numbers: " + Arrays.toString(numbers)
                +"\n- letters: " + Arrays.toString(letters));
    }

    public static <T> void elementSwap(T[] array, int index1, int index2) {
        T storedValue = array[index1];
        array[index1] = array[index2];
        array[index2] = storedValue;
    }
}
