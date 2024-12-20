package course7.homework;

public class Challenge4 {

    public static void main(String[] args) {

        String testString = "Ana are mere."; //our string
        String reversedString = "";
        char[] chars = testString.toCharArray(); //our string converted to array;

        System.out.println("Your normal array/string is: " + testString);
        System.out.print("The reversed version is: "); //I used print instead of println in order to print everything on a single row.
        //variable i initiated as the array's maximum length value and starting from there
        //we decrement i until it reaches 0, concatenate and save everything inside the reversedString variable.
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedString += chars[i];
        }
        System.out.print(reversedString); //I used print instead of println in order to print everything on a single row.
    }
}