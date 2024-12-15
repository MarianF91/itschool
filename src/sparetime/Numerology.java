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

        System.out.println("This code simulates a numerology reading.");

        Scanner scan = new Scanner(System.in);

        //introducing personal info;
        System.out.println("Please tell me the year of your birth (4 digits):");
        yearOfBirth = scan.nextInt();
        if (yearOfBirth > 9999 || yearOfBirth < 1000) { //checking if the year has been entered correctly;
            System.out.println("That is an incorrect value.");
            System.exit(1);
        }

        if (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0 || yearOfBirth % 400 == 0) {
            System.out.println("You were born in a leap year.\n");
        } else {
            System.out.println("Your were not born in a leap year.\n");
        }

        System.out.println("Please tell me the month of your birth (between 1 and 12):");
        monthOfBirth = scan.nextInt();
        if (monthOfBirth < 1 || monthOfBirth > 12){ //checking if the month has been entered correctly;
            System.out.println("That is an incorrect value.");
            System.exit(1);
        }

        System.out.println("Please tell  me the day of your birth (between 1 and 31):");
        dayOfBirth = scan.nextInt();
        if (!isDayValidForMonth(yearOfBirth, monthOfBirth, dayOfBirth)) { //checking if the year has been entered correctly
                                                                         // with an additional condition for february regarding leap years;
            System.out.println("That is an incorrect value for the specified month and year.");
            System.exit(1);
        }

        scan.nextLine();

        System.out.println("Please tell me your first name:");
        firstName = scan.nextLine();

        System.out.println("Please tell me your last name:");
        lastName = scan.nextLine();

        //printing results;
        System.out.println("The Destiny Number represents pre-established path in life and the lessons you must learn.");
        System.out.println("Your Destiny Number is: " + mainNumberOfDestiny());
        if (mainNumberOfDestiny() == 1) {
            System.out.println("This means that you are an independent person, an innovator or, why not, a leader. " +
                    "Be careful not to become stubborn or egocentric.\n");
        } else if (mainNumberOfDestiny() == 2) {
            System.out.println("This means that you are a diplomat and a cooperative and intuitive person. Try " +
                    "not to become" + "passive and undecided\n.");
        } else if (mainNumberOfDestiny() == 3) {
            System.out.println("This means that you are creative, expressive and optimistic. Try not to become shallow " +
                    "and erratic.\n");
        } else if (mainNumberOfDestiny() == 4) {
            System.out.println("This means that you are practical, organized and reliable. Try not to become stubborn " +
                    "and rigid.\n");
        } else if (mainNumberOfDestiny() == 5) {
            System.out.println("This means that you are an adventurer, a free spirit and an adaptable person. Try not " +
                    "to become unpredictable and unreliable.\n");
        } else if (mainNumberOfDestiny() == 6) {
            System.out.println("This means that you are harmonious, loving and responsible. Try not to become possessive " +
                    "or focused only on pleasure.\n");
        } else if (mainNumberOfDestiny() == 7) {
            System.out.println("This means that you are wise, spiritual and analytic. Try not to become withdrawn and " +
                    "solitary.\n");
        } else if (mainNumberOfDestiny() == 8) {
            System.out.println("This means that you are strong, ambitious and materialistic. Try not to become arrogant and " +
                    "manipulative.\n");
        } else {
            System.out.println("This means that you are wise, selfless and a humanitarian. Try not become too idealistic and " +
                    "detached.\n");
        }

        System.out.println("The Expression Number represents how you express yourself into the world and how you manifest your talents.");
        System.out.println("Your Expression Number is: " + mainExpressionNumber());
        if (mainExpressionNumber() == 1) {
            System.out.println("This means that you are natural leader and a project starter. Try not to become too dominant and " +
                    "authoritarian.\n");
        } else if (mainExpressionNumber() == 2) {
            System.out.println("This means that you are a diplomat, cooperative and a good communicator. Try not to become passive and " +
                    "undecided.\n");
        } else if (mainExpressionNumber() == 3) {
            System.out.println("This means that you are a diplomat, cooperative and a good communicator. Try not to become passive and " +
                    "undecided.\n");
        } else if (mainExpressionNumber() == 4) {
            System.out.println("This means that you are a practical, organized and a good builder. Try not to become rigid and " +
                    "stubborn.\n");
        } else if (mainExpressionNumber() == 5) {
            System.out.println("This means that you are an adventurer, a free spirit and an adaptable person. Try not " +
                    "to become unpredictable and unreliable.\n");
        } else if (mainExpressionNumber() == 6) {
            System.out.println("This means that you are harmonious, loving and responsible. Try not to become possessive " +
                    "or focused only on pleasure.\n");
        } else if (mainExpressionNumber() == 7) {
            System.out.println("This means that you are wise, spiritual and analytic. Try not to become withdrawn and " +
                    "solitary.\n");
        } else if (mainExpressionNumber() == 8) {
            System.out.println("This means that you are strong, ambitious and materialistic. Try not to become arrogant and " +
                    "manipulative.\n");
        } else {
            System.out.println("This means that you are wise, selfless and a humanitarian. Try not become too idealistic and " +
                    "detached.\n");
        }

        System.out.println("The Soul Urge Number represents your inner desires, your emotional needs and your motivations.");
        System.out.println("Your soul urge number is: " + mainSoulUrgeNumber());
        if (mainSoulUrgeNumber() == 1) {
            System.out.println("Your soul desires: independence and affirmation. Try not to become egocentric and competitive.\n");
        } else if (mainSoulUrgeNumber() == 2) {
            System.out.println("Your soul desires: harmony and relationships. Try not to become passive and undecided.\n");
        } else if (mainSoulUrgeNumber() == 3) {
            System.out.println("Your soul desires: expressiveness and creativity. Try not to become shallow and erratic.\n");
        } else if (mainSoulUrgeNumber() == 4) {
            System.out.println("Your soul desires: stability and safety. Try not to become rigid and stubborn.\n");
        } else if (mainSoulUrgeNumber() == 5) {
            System.out.println("Your soul desires: freedom and adventure. Try not to become unpredictable and unreliable.\n");
        } else if (mainSoulUrgeNumber() == 6) {
            System.out.println("Your soul desires: love and family. Try not to become possessive and interested only in pleasure.\n");
        } else if (mainSoulUrgeNumber() == 7) {
            System.out.println("Your soul desires: knowledge and wisdom. Try not to become withdrawn and solitary.\n");
        } else if (mainSoulUrgeNumber() == 8) {
            System.out.println("Your soul desires: power and material success. Try not to become arrogant and manipulative.\n");
        } else {
            System.out.println("Your soul desires: to help others and make the world a better place. Try not to become too " +
                    "idealistic and detached.\n");
        }

        System.out.println("The Personality Number represents how you present yourself to the world and interact with others.");
        System.out.println("Your Personality Number is: " + mainPersonalityNumber());
        if (mainPersonalityNumber() == 1) {
            System.out.println("Good traits: independent, confident, a leader.\n" + "Bad traits: arrogant, authoritarian.\n");
        } else if (mainPersonalityNumber() == 2) {
            System.out.println("Good traits: diplomat, cooperative, adaptable.\n" + "Bad traits: undecided, passive.\n");
        } else if (mainPersonalityNumber() == 3) {
            System.out.println("Good traits: sociable, expressive, optimistic.\n" + "Bad traits: shallow, erratic.\n");
        } else if (mainPersonalityNumber() == 4) {
            System.out.println("Good traits: practical, organized, reliable.\n" + "Bad traits: rigid, stubborn.\n");
        } else if (mainPersonalityNumber() == 5) {
            System.out.println("Good traits: adventurous, free, adaptable.\n" + "Bad traits: unpredictable, unreliable.\n");
        } else if (mainPersonalityNumber() == 6) {
            System.out.println("Good traits: harmonious, responsible, loving.\n" + "Bad traits: possessive, interested only in pleasures.\n");
        } else if (mainPersonalityNumber() == 7) {
            System.out.println("Good traits: wise, spiritual, analytic.\n" + "Bad traits: withdrawn, solitary.\n");
        } else if (mainPersonalityNumber() == 8) {
            System.out.println("Good traits: ambitious, strong, materialistic.\n" + "Bad traits: arrogant, manipulative.\n");
        } else {
            System.out.println("Good traits: humanitarian, wise, altruistic.\n" + "Bad traits: idealistic, detached.\n");
        }

        System.out.println("The Maturity Number represents your potential for personal growth and overcoming obstacles.");
        System.out.println("Your maturity number is: " + mainMaturityNumber());
        if (mainMaturityNumber() == 1) {
            System.out.println("You need to take on responsibilities and become independent.\n");
        } else if (mainMaturityNumber() == 2) {
            System.out.println("You need to find balance between your needs and the needs of others.\n");
        } else if (mainMaturityNumber() == 3) {
            System.out.println("You need to find a way to express yourself and your creativity.\n");
        } else if (mainMaturityNumber() == 4) {
            System.out.println("You need to build a solid foundation on which you can organise your life.\n");
        } else if (mainMaturityNumber() == 5) {
            System.out.println("You need to explore the world and overcome your limits.\n");
        } else if (mainMaturityNumber() == 6) {
            System.out.println("You need to cultivate your relationships and start a family.");
        } else if (mainMaturityNumber() == 7) {
            System.out.println("You need to further your knowledge and increase your spirituality.\n");
        } else if (mainMaturityNumber() == 8) {
            System.out.println("You need to use your power and influence in a constructive way.\n");
        } else {
            System.out.println("You need to serve humanity and leave behind a positive legacy.\n");
        }

        System.out.println("This is what Numerology had to say about " + firstName + " " + lastName +
                ". But what does " + firstName + " " + lastName + " has to say about " + firstName + " " + lastName + "?");
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
    return numberFullName; //saves the value for numberFullName for further use;
    }

    static int getEachLetterValue (char lettersFullName){
        return Character.toUpperCase(lettersFullName) - 'A' + 1;  //converts our char to upper case and then, both it and A to their ASCII numeric corespondent,
                                                                 //deducts A's value from our number and adds 1 in order to make
                                                                //it equivalent to the letter's position in the alphabet;
    }

    static int mainSoulUrgeNumber () {

        String fullName = firstName + lastName;
        char [] lettersFullName = fullName.toCharArray();
        String vowels = "AEIOU"; //extra string used to check for vowels in our array;
        int numberVowels = 0; //variable used to calculate the expression number after the conversion from char to number;

        for (char charFullName : lettersFullName){
            if (vowels.indexOf(Character.toUpperCase(charFullName)) != -1) { //converts our char to upper case, then crosses reference to see which char is a vowel
                                                                             //for each vowel found, adds it's value to numberVowels;
                numberVowels += getEachLetterValue(charFullName);
            }
        }

        while (numberVowels >= 10){ //checks if the result in the "for" loop is >= 10 and adds the first and last number together to get a new 1 digit value;
            numberVowels = (numberVowels / 10) + (numberVowels % 10);
        }
        return numberVowels; //saves the value for numberVowels for further use;
    }

    static int mainPersonalityNumber() { //does the same thing as static int mainSoulUrgeNumber (), but it uses consonants;
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

    static boolean isLeapYear (int yearOfBirth){ //checks to see if we have a leap year or not;
        return (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0 || yearOfBirth % 400 == 0);
    }

    static boolean isDayValidForMonth (int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        if (dayOfBirth < 1 || dayOfBirth > 31) {
            return false;
        }

        //checks to see if the month should have 30 or 31 days;
        if (monthOfBirth == 1 || monthOfBirth == 3 || monthOfBirth == 5 || monthOfBirth == 7 || monthOfBirth == 8 ||
        monthOfBirth == 10 || monthOfBirth == 12) {
            return dayOfBirth <= 31;
        } else if (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11){
            return dayOfBirth <= 30;
        }

        //special condition for february, to see if we have 28 or 29 days depending upon we have a leap year or not.
        if (isLeapYear((yearOfBirth))) {
            return dayOfBirth <= 29;
            } else {
            return dayOfBirth <= 28;
        }
    }
}