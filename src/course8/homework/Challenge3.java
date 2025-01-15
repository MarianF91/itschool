package course8.homework;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        System.out.println("This code will concatenate a multitude of strings and print out the final result.");

        stringBuilderInput();
    }

    static void stringBuilderInput() {

        System.out.println("Enter the first word/string: ");
        Scanner scan = new Scanner(System.in);

        StringBuilder stringCollection = new StringBuilder(scan.nextLine());

        while (true) {
            System.out.println("Do you wish to add another word/string to the collection?");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter the additional word/string.");

                if (!stringCollection.isEmpty()){
                    stringCollection.append(", ");
                }
                stringCollection.append(scan.nextLine());

            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Your collection is: " + stringCollection);
                break;
            } else {
                System.out.println("Invalid answer.");
            }
        }
    }
}