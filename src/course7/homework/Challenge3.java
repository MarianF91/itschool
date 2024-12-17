package course7.homework;

public class Challenge3 {

    public static void main(String[] args) {

        int[] intArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int negativeCounter = 0;

        System.out.print("Your negative numbers are: ");
        for (int negative : intArray) {
            if (negative < 0) {
                System.out.print(negative + ", ");
                negativeCounter++;
            }
        }
        System.out.println("\nYou have a total of " + negativeCounter + " numbers.");
    }
}