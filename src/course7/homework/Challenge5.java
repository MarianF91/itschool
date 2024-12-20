package course7.homework;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("This simulates a Fibonacci series. Choose the value for n.");

        int n = scanner.nextInt();

        if (n < 1 ){
            System.out.print("Number too low.");
            System.exit(1);
        }

        System.out.print("Your Fibonacci series is: " + firstNumber + " ," + secondNumber + ", ");
        for (int i = 0; i < n; i++){
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber + secondNumber;
            System.out.print(firstNumber + " ," + secondNumber + ", ");
        }
    }
}