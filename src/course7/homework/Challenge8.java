package course7.homework;

public class Challenge8 {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Your first 10 numbers in a Fibonacci series are: " + firstNumber + ", "+ secondNumber + ", ");

        for (int i = 0; i < 4; i++) {

            firstNumber = firstNumber+ secondNumber;
            secondNumber = firstNumber + secondNumber;
            System.out.print(firstNumber + ", " + secondNumber + ", ");
        }
    }
}