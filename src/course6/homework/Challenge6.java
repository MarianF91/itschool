package course6.homework;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature (without using any commas):");

        int temperature = scan.nextInt();

        if (temperature > 30){
            System.out.println("Ouch! Hot!");
        } else if (temperature <= 30 && temperature >= 20) {
            System.out.println("Warm...");
        } else {
            System.out.println("Brrr! Cold!");
        }
    }
}
