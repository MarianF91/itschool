package course10.homework;

import java.util.Arrays;

public class Challenge4 {

    public static void main(String[] args) {

        isOddOrEven();
    }

    public static void isOddOrEven(){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int odd = 0;
        int even = 0;

        for (int number: numbers) {

            if (number % 2 == 0){

                even += 1;
            } else {

                odd += 1;
            }
        }

        System.out.println("This is our array of numbers: " + Arrays.toString(numbers));
        System.out.println("You have " + even + " even numbers.");
        System.out.println("You have " + odd + " odd numbers.");
    }
}