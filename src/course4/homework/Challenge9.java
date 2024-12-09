package course4.homework;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {

        System.out.println("This code demonstrates the use of each compound assignment operator on an int type number.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an int type number: ");

        int testNumber = scan.nextInt();
        int originalValue = testNumber; //keeps the original value of the number;

        System.out.println("For argument's sake, the number used to test each operator's effect on your number is 2.");
        System.out.println("You have chosen " + testNumber + " as your number.");
        System.out.println("Each of these operators replaces the value of the variable on it's left side depending on it's function and" +
                " in accordance with what we have on it's right side.");
        System.out.println("I will now print the results for each operator.");

        testNumber = 2;
        System.out.println("The test result for = is: " + testNumber + " = 2 because all that this operator does is " +
                "overwrite the value of the variable on the left with the value on the right.");

        testNumber = originalValue;
        testNumber += 2;
        System.out.println("The test result for += is: " + originalValue + " + 2 = " + testNumber +
                " because this operator add the value on the right to the value" +
                "on the left and replaces the original value with the result of the operation.");

        testNumber = originalValue;
        testNumber -= 2;
        System.out.println("The test result for -= is: " + originalValue + " - 2 = " + testNumber +
                " because this operator deducts the value on the right from the value" +
                "on the left and replaces the original value with the result of the operation.");

        testNumber = originalValue;
        testNumber *= 2;
        System.out.println("The test result for *= is: " + originalValue + " * 2 = "  + testNumber +
                " because this operator multiplies the value on the left with the value" +
                " on the right and replaces the original value with the result of the multiplication.");

        testNumber = originalValue;
        testNumber /= 2;
        System.out.println("The test result for /= is: " + originalValue + " / 2 = "  + testNumber +
                " because this operator divides the value on the left with the value" +
                " on the right and replaces the original value with the quant of that division.");

        testNumber = originalValue;
        testNumber %= 2;
        System.out.println("The test result for %= is: " + originalValue + " % 2 = "  + testNumber +
        " because this operator divides the value on the left with the value" +
                " on the right, returns only the rest from that division" +
                " and replaces the original value with the result of the operation.");

        System.out.println("This is all that I've got for you right now. Have a nice day!");
    }
}