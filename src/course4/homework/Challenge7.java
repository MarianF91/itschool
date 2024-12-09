package course4.homework;

public class Challenge7 {

    public static void main(String[] args) {

        System.out.println("This code counts from 1 to 10 and back");

        int number;

        //starting the loop for counting from 1 to 10

        for (number = 1; number <= 10; number++) { //this sequence gets the starting number, checks if
                                                                //our variable is lower or equal to 10 and, if
                                                                //the condition checks, it increases its value by 1

            System.out.println(number);
        }

        //starting the loop for counting from 10 to 1
        for (number = 10; number >= 1; number--) { //this sequence gets the starting number,
                                                                //checks if our variable is higher or equal to 1 and,
                                                                // if the condition checks, it decreases its value by 1

            System.out.println(number);
        }
    }
}