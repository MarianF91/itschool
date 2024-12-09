package course4.homework;

import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {

        System.out.println("This adds together two byte type variables and stores the result in a byte type variable (with explanations).");

        Scanner scan = new Scanner(System.in);

        System.out.println("Input your first byte type variable (between -128 and 127)");
        byte firstByteVariable = scan.nextByte();

        System.out.println("Input yor second byte type variable (betweeen -128 and 127)");
        byte secondByteVariable = scan.nextByte();

        byte result = (byte) (firstByteVariable + secondByteVariable);

        if (firstByteVariable >= 0 && secondByteVariable >= 0 && result < 0) {
            System.out.println("Your result is " + result + ". This may seem odd because your numbers were positive, but I have an explanation \n" +
                    "for what happened. The sum of your numbers was above 127 and, since byte types only know to count from -128 to 127, \n" +
                    "everything above 127 goes into something called Positive Overflow and the count for it starts from -128 and goes from there \n" +
                    "until it reaches the equivalent value.");

        } else if (firstByteVariable < 0 && secondByteVariable < 0 && result >= 0 || result <= 0) {
            System.out.println("Your result is " + result + ". This may seem odd because your numbers were negative, but I have an explanation \n" +
                    "for what happened. The sum of your numbers was below 128 and, since byte types only know to count from -128 to 127, \n" +
                    "everything below 128 goes into something called Negative Overflow and can be positive or negative, depending on where the count \n" +
                    "for it stops.");
        } else {
            System.out.println("The sum of your numbers is: " + result);
        }
    }
}