package course4.homework;

import java.util.Scanner;

public class Challenge13 {

    public static void main(String[] args) {

        System.out.println("This code performs operations between an integer and a double.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Input an int type variable: ");
        int intVariable = scan.nextInt();

        System.out.println("Input a double type variable: ");
        double doubleVariable = scan.nextDouble();

        //Defining the results - I used "var", due to it's "wildcard" nature. Also, if you try to use anything other than this or "double",
        //the complier won't let you.
        var addition = intVariable + doubleVariable;
        var substraction = intVariable - doubleVariable;
        var multiplication = intVariable * doubleVariable;
        var divisation = intVariable / doubleVariable;
        var modulo = intVariable % doubleVariable;

        //Printingout the results and the explanation.
        System.out.println("The result for addition is: " + addition);
        System.out.println("The result for substraction is: " + substraction);
        System.out.println("The result for multiplication is: " + multiplication);
        System.out.println("The result for divisation is: " + divisation);
        System.out.println("The result for modulo is: " + modulo);

        System.out.println("As you can see, all the results are printed in the format number.decimal. This happened " +
                "because the results of the operations between the int and the double have been converted to double " +
                "due to numeric conversion rules, Rule 1 if we are to be specific, which states the following: If two values" +
                "have different data types, Java will automatically promote one of the values to the larger of the two " +
                "data types. Thus, double being larger than in, the result has been converted to double.");
    }
}