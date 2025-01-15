package course8.homework;

import java.util.Scanner;

public class Challenge19 {

    public static void main(String[] args) {

        System.out.println("The roman conversion is: " + conversionIntegerToRoman());

    }

    public static String conversionIntegerToRoman() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number higher than 0 and without decimals.");

        int number = scanner.nextInt();

        StringBuilder conversionToRoman = new StringBuilder();

        if (number < 1) {
            System.out.println("Invalid choice.");
        }

        int[] arabNumerals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < arabNumerals.length; i++) {
            //runs until our number is lower than anything in arabNumerals and adds the same romanNumerals equivalent if necessary;
            while (number >= arabNumerals[i]) {
                //adds the corresponding value from romanNumerals to our string;
                conversionToRoman.append(romanNumerals[i]);
                //deducts the highest value of arabNumerals from our number and saves the new value to number until it reaches the end;
                number -= arabNumerals[i];
            }
        }
        return conversionToRoman.toString();
    }
}