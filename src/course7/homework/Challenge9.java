package course7.homework;

public class Challenge9 {

    public static void main(String[] args) {

        int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Your odd numbers are:");
        for (int number : numberArray){
            if (number % 2 != 0){
                System.out.print(number + " ,");
            }
        }

        System.out.println("\n");
        System.out.print("Your even numbers are: ");
        for (int number : numberArray){
            if (number % 2 == 0){
                System.out.print(number + " ,");
            }
        }
    }
}