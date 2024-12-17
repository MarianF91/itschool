package course6.homework;

import java.util.Scanner;

public class Challenge16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score (between 0 and 100):");
        double score = scan.nextDouble();

        if (score > 100) {
            System.out.println("Why are you still in school? Go work for NASA, like little Timmy. Don't be a failure!");
        } else if (score >= 90) {
            System.out.println("You took an A, as in << A better grade is needed, something like A+ or A++ >>... you Failure!");
        } else if (score >= 80) {
            System.out.println("You took a B, as in << Why do I even Bother to teach you anything, you Failure?!");
        } else if (score >= 70) {
            System.out.println("You took a C, as in << Why Can't you be a good student, like your Cousin Timmy, you Failure?!");
        } else if (score >= 60) {
            System.out.println("You took D, as in << Do you want to be something else besides a Failure... you Failure?!");
        } else if (score > 0) {
            System.out.println("You took an F... for Failure!");
        } else {
            System.out.println("Do you even know how to breathe... you Failure?!");
        }
    }
}