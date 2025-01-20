package recap.loops.and.flow.control;

import java.util.Scanner;

public class Recap2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day of the week from 1 to 7.");
        int answer = scan.nextInt();

        if (answer > 7 || answer < 1) {
            System.out.println("Invalid option.");
        }

        switch (answer) {
            case 1:
                System.out.println("Weekday: Monday");
                break;
            case 2:
                System.out.println("Weekday: Tuesday");
                break;
            case 3:
                System.out.println("Weekday: Wednesday");
                break;
            case 4:
                System.out.println("Weekday: Thursday");
                break;
            case 5:
                System.out.println("Weekday: Friday");
                break;
            case 6:
                System.out.println("Weekend: Saturday");
                break;
            case 7:
                System.out.println("Weekend: Sunday");
                break;
        }
    }
}