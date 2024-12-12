package sparetime;

import java.util.Scanner;

public class Numerology {

    static int destinyNumber;
    static int maturityNumber;
    static int yearOfBirth;
    static int monthOfBirth;
    static int dayOfBirth;
    static String firstName;
    static String lastName;

    public static void main(String[] args) {

        System.out.println("This code simulates a numerolgy reading.");

        Scanner scan = new Scanner(System.in);

        //introducing personal info;
        System.out.println("Please tell me the year of your birth (4 digits):");
        yearOfBirth = scan.nextInt();
        if (yearOfBirth > 9999 || yearOfBirth < 1000) { //checking if the year has been entered correctly;
            System.out.println("That is an incorrect value.");
            System.exit(1);
        }

        System.out.println("Please tell me the month of your birth (between 1 and 12):");
        monthOfBirth = scan.nextInt();
        if (monthOfBirth < 1 || monthOfBirth > 12){ //checking if the month has been entered correctly;
            System.out.println("That is an incorrect value.");
            System.exit(1);
        }

        System.out.println("Please tell  me the day of your birth (between 1 and 31):");
        dayOfBirth = scan.nextInt();
        if (!isDayValidForMonth(yearOfBirth, monthOfBirth, dayOfBirth)) { //checking if the year has been entered correctly with an aditional info for february regarding leap years;
            System.out.println("That is an incorrect value for the specified month and year.");
            System.exit(1);
        }

        scan.nextLine();

        System.out.println("Please tell me your first name:");
        firstName = scan.nextLine();

        System.out.println("Please tell me your last name:");
        lastName = scan.nextLine();

        //printing results;
        System.out.println("Your destiny number is: " + mainNumberOfDestiny());
        System.out.println("Your expression number is: " + mainExpressionNumber());
        System.out.println("Your soul urge number is: " + mainSoulUrgeNumber());
        System.out.println("Your personality number is: " + mainPersonalityNumber());
        System.out.println("Your maturity number is: " + mainMaturityNumber());

        if (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0 || yearOfBirth % 400 == 0) {
            System.out.println("You were not born in a leap year.");
        } else {
            System.out.println("Your were born in a leap year.");
        }
       }

       //method to calculate the number of destiny
     static int mainNumberOfDestiny(){

        int firstNumberOfYear = yearOfBirth % 10;
        yearOfBirth /= 10;
        int secondNumberOfYear = yearOfBirth % 10;
        yearOfBirth /=10;
        int thirdNumberOfYear = yearOfBirth % 10;
        yearOfBirth /= 10;
        int fourthNumberOfYear = yearOfBirth % 10;

        while (monthOfBirth > 9) {
            monthOfBirth = (monthOfBirth / 10) + (monthOfBirth % 10);
        }

        while (dayOfBirth > 9) {
            dayOfBirth = (dayOfBirth / 10) + (dayOfBirth % 10);
        }

        destinyNumber = firstNumberOfYear + secondNumberOfYear + thirdNumberOfYear + fourthNumberOfYear + monthOfBirth + dayOfBirth;

        while (destinyNumber >= 10) {
            destinyNumber = (destinyNumber / 10) + (destinyNumber % 10);
        }
        return destinyNumber;
    }

    //method to calculate the expression number;
    static int mainExpressionNumber() {

        String fullName = firstName + lastName; //adding first and last name in one variable;
        char [] lettersFullName = fullName.toCharArray(); //converting fullName from string to char array;
        int numberFullName = 0; //variable used to calculate the expression number after the conversion from char to number;

        for (char charFullName : lettersFullName){ //checks if all the elements in charFullName are letters
            if (Character.isLetter(charFullName)) {
                numberFullName += getEachLetterValue(charFullName); //adds the numeric value of each found letter to numberFullName;
            }
        }

        while (numberFullName >=10){ //checks if the result in the "for" loop is >= 10 and adds the first and last number together to get a new 1 digit value;
            numberFullName = (numberFullName / 10) + (numberFullName % 10);
        }
    return numberFullName;
    }

    static int getEachLetterValue (char lettersFullName){
        return Character.toUpperCase(lettersFullName) - 'A' + 1;
    }

    static int mainSoulUrgeNumber () {

        String fullName = firstName + lastName;
        char [] lettersFullName = fullName.toCharArray();
        String vowels = "AEIOU";
        int numberVowels = 0;

        for (char charFullName : lettersFullName){
            if (vowels.indexOf(Character.toUpperCase(charFullName)) != -1) {
                numberVowels += getEachLetterValue(charFullName);
            }
        }

        while (numberVowels >=10){
            numberVowels = (numberVowels / 10) + (numberVowels % 10);
        }
        return numberVowels;
    }

    static int mainPersonalityNumber() {
        String fullName = firstName + lastName;
        char [] lettersFullName = fullName.toCharArray();
        String consonant = "BCDFGHJKLMNPQRSTUVWXYZ";
        int numberConsonant = 0;

        for (char charFullName : lettersFullName){
            if (consonant.indexOf(Character.toUpperCase(charFullName)) != -1) {
                numberConsonant += getEachLetterValue(charFullName);
            }
        }

        while (numberConsonant >=10){
            numberConsonant = (numberConsonant / 10) + (numberConsonant % 10);
        }
        return numberConsonant;
    }

    static int mainMaturityNumber() {
        maturityNumber = mainNumberOfDestiny() + mainExpressionNumber();

        while (maturityNumber >= 10) {
            maturityNumber = (maturityNumber / 10) + (maturityNumber % 10);
        }

        return maturityNumber;
    }

    static boolean isLeapYear (int yearOfBirth){
        return (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0 || yearOfBirth % 400 == 0);
    }

    static boolean isDayValidForMonth (int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        if (dayOfBirth < 1 || dayOfBirth > 31) {
            return false;
        }

        if (monthOfBirth == 1 || monthOfBirth == 3 || monthOfBirth == 5 || monthOfBirth == 7 || monthOfBirth == 8 ||
        monthOfBirth == 10 || monthOfBirth == 12) {
            return dayOfBirth <= 31;
        } else if (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11){
            return dayOfBirth <= 30;
        }

        if (isLeapYear((yearOfBirth))) {
            return dayOfBirth <= 29;
            } else {
            return dayOfBirth <= 28;
        }
    }
}