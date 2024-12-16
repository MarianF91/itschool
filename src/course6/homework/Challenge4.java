package course6.homework;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first height (without using any commas):");
        int firstHeight = scan.nextInt();

        System.out.println("Enter the second height (without using any commas):");
        int secondHeight = scan.nextInt();

        if (firstHeight == secondHeight) {
            System.out.println("The values must be different.");
            
            System.exit(1);
        }
        
        String maximumHeight = (firstHeight > secondHeight) ? ((firstHeight + "is the higher value, because ") + (firstHeight + " > " + secondHeight))
        : ((secondHeight + " is the higher value, because ") + (secondHeight + " > " + firstHeight));

        System.out.println(maximumHeight);
    }
}