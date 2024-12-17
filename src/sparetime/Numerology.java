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

        if (isLeapYear(yearOfBirth)) {
            System.out.println("You were born in a leap year.\n");
        } else {
            System.out.println("Your were not born in a leap year.\n");
        }

        System.out.println("Please tell me the month of your birth (between 1 and 12):");
        monthOfBirth = scan.nextInt();
        if (monthOfBirth < 1 || monthOfBirth > 12) { //checking if the month has been entered correctly;
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

        System.out.println("\n");

        //output results;
        System.out.println(outputDestiny());
        System.out.println(outputExpression());
        System.out.println(outputSoulUrge());
        System.out.println(outputPersonality());
        System.out.println(outputMaturity());
        System.out.println("\nThis is what Numerology had to say about " + firstName + " " + lastName +
                ". But what does " + firstName + " " + lastName + " have to say about " + firstName + " " + lastName + "?");
    }

    //output messages for destiny number;
    static String outputDestiny() {
        String outputDestiny;

        System.out.println("The Destiny Number represents pre-established path in life and the lessons you must learn.");
        System.out.println("Your Destiny Number is: " + mainNumberOfDestiny());
        if (mainNumberOfDestiny() == 1) {
            outputDestiny = "This means that you are an independent person, an innovator or, why not, a leader. " +
                    "Be careful not to become stubborn or egocentric.\n";
        } else if (mainNumberOfDestiny() == 2) {
            outputDestiny = "This means that you are a diplomat and a cooperative and intuitive person. Try " +
                    "not to become" + "passive and undecided\n.";
        } else if (mainNumberOfDestiny() == 3) {
            outputDestiny = "This means that you are creative, expressive and optimistic. Try not to become shallow " +
                    "and erratic.\n";
        } else if (mainNumberOfDestiny() == 4) {
            outputDestiny = "This means that you are practical, organized and reliable. Try not to become stubborn " +
                    "and rigid.\n";
        } else if (mainNumberOfDestiny() == 5) {
            outputDestiny = "This means that you are an adventurer, a free spirit and an adaptable person. Try not " +
                    "to become unpredictable and unreliable.\n";
        } else if (mainNumberOfDestiny() == 6) {
            outputDestiny = "This means that you are harmonious, loving and responsible. Try not to become possessive " +
                    "or focused only on pleasure.\n";
        } else if (mainNumberOfDestiny() == 7) {
            outputDestiny = "This means that you are wise, spiritual and analytic. Try not to become withdrawn and " +
                    "solitary.\n";
        } else if (mainNumberOfDestiny() == 8) {
            outputDestiny = "This means that you are strong, ambitious and materialistic. Try not to become arrogant and " +
                    "manipulative.\n";
        } else {
            outputDestiny = "This means that you are wise, selfless and a humanitarian. Try not become too idealistic and " +
                    "detached.\n";
        }
        return outputDestiny;
    }

    //output messages for expression number;
    static String outputExpression() {
        String expression;

        System.out.println("The Expression Number represents how you express yourself into the world and how you manifest your talents.");
        System.out.println("Your Expression Number is: " + mainExpressionNumber());

        if (mainExpressionNumber() == 1) {
            expression = "This means that you are natural leader and a project starter. Try not to become too dominant and " +
                    "authoritarian.\n";
        } else if (mainExpressionNumber() == 2) {
            expression = "This means that you are a diplomat, cooperative and a good communicator. Try not to become passive and " +
                    "undecided.\n";
        } else if (mainExpressionNumber() == 3) {
            expression = "This means that you are a diplomat, cooperative and a good communicator. Try not to become passive and " +
                    "undecided.\n";
        } else if (mainExpressionNumber() == 4) {
            expression = "This means that you are a practical, organized and a good builder. Try not to become rigid and " +
                    "stubborn.\n";
        } else if (mainExpressionNumber() == 5) {
            expression = "This means that you are an adventurer, a free spirit and an adaptable person. Try not " +
                    "to become unpredictable and unreliable.\n";
        } else if (mainExpressionNumber() == 6) {
            expression = "This means that you are harmonious, loving and responsible. Try not to become possessive " +
                    "or focused only on pleasure.\n";
        } else if (mainExpressionNumber() == 7) {
            expression = "This means that you are wise, spiritual and analytic. Try not to become withdrawn and " +
                    "solitary.\n";
        } else if (mainExpressionNumber() == 8) {
            expression = "This means that you are strong, ambitious and materialistic. Try not to become arrogant and " +
                    "manipulative.\n";
        } else {
            expression = "This means that you are wise, selfless and a humanitarian. Try not become too idealistic and " +
                    "detached.\n";
        }
        return expression;
    }

    //output messages for soul urge number;
    static String outputSoulUrge() {
        String soul;

        System.out.println("The Soul Urge Number represents your inner desires, your emotional needs and your motivations.");
        System.out.println("Your soul urge number is: " + mainSoulUrgeNumber());
        if (mainSoulUrgeNumber() == 1) {
            soul = "Your soul desires: independence and affirmation. Try not to become egocentric and competitive.\n";
        } else if (mainSoulUrgeNumber() == 2) {
            soul = "Your soul desires: harmony and relationships. Try not to become passive and undecided.\n";
        } else if (mainSoulUrgeNumber() == 3) {
            soul = "Your soul desires: expressiveness and creativity. Try not to become shallow and erratic.\n";
        } else if (mainSoulUrgeNumber() == 4) {
            soul = "Your soul desires: stability and safety. Try not to become rigid and stubborn.\n";
        } else if (mainSoulUrgeNumber() == 5) {
            soul = "Your soul desires: freedom and adventure. Try not to become unpredictable and unreliable.\n";
        } else if (mainSoulUrgeNumber() == 6) {
            soul = "Your soul desires: love and family. Try not to become possessive and interested only in pleasure.\n";
        } else if (mainSoulUrgeNumber() == 7) {
            soul = "Your soul desires: knowledge and wisdom. Try not to become withdrawn and solitary.\n";
        } else if (mainSoulUrgeNumber() == 8) {
            soul = "Your soul desires: power and material success. Try not to become arrogant and manipulative.\n";
        } else {
            soul = "Your soul desires: to help others and make the world a better place. Try not to become too " +
                    "idealistic and detached.\n";
        }
        return soul;
    }

    //output messages for personality number;
    static String outputPersonality() {
        String personality;

        System.out.println("The Personality Number represents how you present yourself to the world and interact with others.");
        System.out.println("Your Personality Number is: " + mainPersonalityNumber());
        if (mainPersonalityNumber() == 1) {
            personality = "Good traits: independent, confident, a leader.\t" + "Bad traits: arrogant, authoritarian.\n";
        } else if (mainPersonalityNumber() == 2) {
            personality = "Good traits: diplomat, cooperative, adaptable.\t" + "Bad traits: undecided, passive.\n";
        } else if (mainPersonalityNumber() == 3) {
            personality = "Good traits: sociable, expressive, optimistic.\t" + "Bad traits: shallow, erratic.\n";
        } else if (mainPersonalityNumber() == 4) {
            personality = "Good traits: practical, organized, reliable.\t" + "Bad traits: rigid, stubborn.\n";
        } else if (mainPersonalityNumber() == 5) {
            personality = "Good traits: adventurous, free, adaptable.\t" + "Bad traits: unpredictable, unreliable.\n";
        } else if (mainPersonalityNumber() == 6) {
            personality = "Good traits: harmonious, responsible, loving.\t" + "Bad traits: possessive, interested only in pleasures.\n";
        } else if (mainPersonalityNumber() == 7) {
            personality = "Good traits: wise, spiritual, analytic.\t" + "Bad traits: withdrawn, solitary.\n";
        } else if (mainPersonalityNumber() == 8) {
            personality = "Good traits: ambitious, strong, materialistic.\t" + "Bad traits: arrogant, manipulative.\n";
        } else {
            personality = "Good traits: humanitarian, wise, altruistic.\t" + "Bad traits: idealistic, detached.\n";
        }
        return personality;
    }

    //output messages for maturity number;
    static String outputMaturity() {
        String maturity;

        System.out.println("The Maturity Number represents your potential for personal growth and overcoming obstacles.");
        System.out.println("Your maturity number is: " + mainMaturityNumber());
        if (mainMaturityNumber() == 1) {
            maturity = "You need to take on responsibilities and become independent.\n";
        } else if (mainMaturityNumber() == 2) {
            maturity = "You need to find balance between your needs and the needs of others.\n";
        } else if (mainMaturityNumber() == 3) {
            maturity = "You need to find a way to express yourself and your creativity.\n";
        } else if (mainMaturityNumber() == 4) {
            maturity = "You need to build a solid foundation on which you can organise your life.\n";
        } else if (mainMaturityNumber() == 5) {
            maturity = "You need to explore the world and overcome your limits.\n";
        } else if (mainMaturityNumber() == 6) {
            maturity = "You need to cultivate your relationships and start a family.";
        } else if (mainMaturityNumber() == 7) {
            maturity = "You need to further your knowledge and increase your spirituality.\n";
        } else if (mainMaturityNumber() == 8) {
            maturity = "You need to use your power and influence in a constructive way.\n";
        } else {
            maturity = "You need to serve humanity and leave behind a positive legacy.\n";
        }
        return maturity;
    }

    //method to calculate the number of destiny
    static int mainNumberOfDestiny() {
        int tempYear = yearOfBirth;
        int firstNumberOfYear = tempYear % 10;
        tempYear /= 10;
        int secondNumberOfYear = tempYear % 10;
        tempYear /= 10;
        int thirdNumberOfYear = tempYear % 10;
        tempYear /= 10;
        int fourthNumberOfYear = tempYear % 10;

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
        char[] lettersFullName = fullName.toCharArray(); //converting fullName from string to char array;
        int numberFullName = 0; //variable used to calculate the expression number after the conversion from char to number;

        for (char charFullName : lettersFullName) { //checks if all the elements in charFullName are letters
            if (Character.isLetter(charFullName)) {
                numberFullName += getEachLetterValue(charFullName); //adds the numeric value of each found letter to numberFullName;
            }
        }

        while (numberFullName >= 10) { //checks if the result in the "for" loop is >= 10 and adds the first and last number together to get a new 1 digit value;
            numberFullName = (numberFullName / 10) + (numberFullName % 10);
        }
        return numberFullName; //saves the value for numberFullName for further use;
    }

    static int getEachLetterValue(char lettersFullName) {
        return Character.toUpperCase(lettersFullName) - 'A' + 1;  //converts our char to upper case and then, both it and A to their ASCII numeric corespondent,
        //deducts A's value from our number and adds 1 in order to make
        //it equivalent to the letter's position in the alphabet;
    }

    // method for returning the number of vowels
    static int getNumberOfVowels() {
        String fullName = firstName + lastName;
        char[] lettersFullName = fullName.toCharArray();
        String vowels = "AEIOU"; //extra string used to check for vowels in our array;
        int numberVowels = 0; //variable used to calculate the expression number after the conversion from char to number;

        for (char charFullName : lettersFullName) {
            if (vowels.indexOf(Character.toUpperCase(charFullName)) != -1) { //converts our char to upper case, then crosses reference to see which char is a vowel
                //for each vowel found, adds it's value to numberVowels;
                numberVowels += getEachLetterValue(charFullName);
            }
        }
        return numberVowels;
    }


    static int mainSoulUrgeNumber() {

        int numberVowels = getNumberOfVowels(); //variable used to calculate the expression number after the conversion from char to number;

        while (numberVowels >= 10) { //checks if the result in the loop is >= 10 and adds the first and last number together to get a new 1 digit value;
            numberVowels = (numberVowels / 10) + (numberVowels % 10);
        }
        return numberVowels; //saves the value for numberVowels for further use;
    }

    static int mainPersonalityNumber() { //does the same thing as static int mainSoulUrgeNumber (), but it uses consonants;
        String fullName = firstName + lastName;
        // numberConsonant means total number of letters in the text minus the number of vowels.
        int numberConsonant = 0;

        for (char consonant : fullName.toUpperCase().toCharArray()) {
            if (Character.isLetter(consonant) && !"AEIOU".contains(String.valueOf(consonant))) {
                numberConsonant += getEachLetterValue(consonant);
            }
        }
        while (numberConsonant >= 10) {
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

    static boolean isLeapYear(int yearOfBirth) { //checks to see if we have a leap year or not;
        return (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0 || yearOfBirth % 400 == 0);
    }

    static boolean isDayValidForMonth(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        if (dayOfBirth < 1 || dayOfBirth > 31) {
            return false;
        }

        //checks to see if: the month should have 30 or 31 days for normal months, 28 or 29 for February in Leap Years;
        if (monthOfBirth == 2) {
            if (isLeapYear(yearOfBirth)) {
                return dayOfBirth <= 29;
            } else {
                return dayOfBirth <= 28;
            }
        } else if (monthOfBirth == 4 || monthOfBirth == 6 || monthOfBirth == 9 || monthOfBirth == 11) {
            return dayOfBirth <= 30;
        } else {
            return true;
        }
    }
}