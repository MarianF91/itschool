package course7.homework;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's calculate a sum by being discriminative and take into account only the numbers higher than 5." +
                " Sorry for that, 5 and below! :(");

        double sum = 0;

        while (true) {

            System.out.println("Input a number: ");
            double number = scan.nextDouble();
            scan.nextLine();

            if (number <= 5) {
                System.out.println("This number is too low and will not be added to the total.");
                continue;
            }

            sum += number;

            while (true) { //I used the "true" condition to purposely send the "while" loop to infinite runs.
                System.out.println("Do you want to stop? Type Yes or No."); //this asks the users if he/she wants the adding to stop.

                String answer = scan.nextLine();

                if (answer.equalsIgnoreCase("Yes")) { //if the answer is "yes", regardless of case, then the program will exit this loop
                    //and go back to the main "while" loop and ask for another number".
                    System.out.println("Your total is: " + sum);
                    return; //this command tells the code to go to the main "while" loop.
                } else if (answer.equalsIgnoreCase("No")) { // if the answer is "no", regardless of case, then the program will end and the
                    //program will show the results.
                    break; //this, as it's name states, will break the whole thing;
                } else {
                    System.out.println("Invalid answer."); //if the user types anything else besides "yes" or "no", the program will continue to
                    //ask for "yes" or "no".
                }
            }
        }
    }
}