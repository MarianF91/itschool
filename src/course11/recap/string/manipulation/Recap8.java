package course11.recap.string.manipulation;

import java.util.Scanner;

public class Recap8 {

    public static void main(String[] args) {

        String compressedString = stringCompression();
        System.out.println("The compressed string is: " + compressedString);

    }

    public static String stringCompression() {

        String originalString;
        Scanner scan = new Scanner(System.in);
        StringBuilder compressionString = new StringBuilder();
        int charCounter = 1; //variable used to count the number of times a char was printed;

        System.out.println("Enter a string (ex:aaabbbccc).");
        originalString = scan.nextLine();

        for (int i = 0; i < originalString.length(); i++) {

            char currentChar = originalString.charAt(i);

            if (i > 0 && currentChar == originalString.charAt(i - 1)) {
                //checks if the current char and previous char are equal and starts counting;
                charCounter++;
            } else {
                if (charCounter > 1) {
                    compressionString.append(compressionString.charAt(compressionString.length() - 1));
                    compressionString.append(charCounter);
                }
                compressionString.append(currentChar);
                charCounter = 1;
            }
        }
        // Handle the last character count
        if (charCounter > 1) {
            compressionString.append(compressionString.charAt(compressionString.length() - 1));
            compressionString.append(charCounter);
        }
        return compressionString.toString();
    }
}