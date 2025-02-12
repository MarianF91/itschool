package course11recap.loopsandflowcontrol;

import java.util.Arrays;
import java.util.Scanner;

public class Recap9 {

    static int[] arraySize;


    public static void main(String[] args) {

        System.out.println("This will show you your array and it's altered version.");
        System.out.println("The original array is: " + Arrays.toString(originalArray()));
        System.out.println("The altered array is: " + Arrays.toString(alteredArray()));
    }


    public static int[] originalArray() {

        Scanner scan = new Scanner(System.in);
        int size;

        System.out.println("How many elements do you want in the array?");
        size = scan.nextInt();
        arraySize = new int[size];

        System.out.println("Enter an element for the array");

        for (int i = 0; i < size; i++) {

            arraySize[i] = scan.nextInt();
            System.out.println("Enter another element.");
        }
        return arraySize;
    }


    public static int[] alteredArray() {

        for (int i = 0; i < arraySize.length; i++) {

            if (arraySize[i] % 2 != 0) {
                arraySize[i]++;
            } else {
                arraySize[i]--;
            }
        }
        return arraySize;
    }
}