package course9.homework;

public class BonusChallenge {

    public static void main(String[] args) {

        cineVreaMere();
    }

    public static void cineVreaMere() {

        String originalFirstString = "Ana are mere.";
        String originalSecondString = "Si Ionut are mere.";

        System.out.println("Original strings:\n" + originalFirstString+ "\n" + originalSecondString);

        String alteredFirstString = "";
        String alteredSecondString = "";
        String combinedStrings;

        for (int i = 0; i < originalFirstString.length(); i++){
            char lettersFirstString = originalFirstString.charAt(i);

            if (Character.isLetter(lettersFirstString) || Character.isWhitespace(lettersFirstString)){
                alteredFirstString += lettersFirstString;
            }

        }

        for (int i = 0; i < originalSecondString.length(); i++){
            char lettersSecondString = originalSecondString.charAt(i);

            if (Character.isLetter(lettersSecondString) && Character.isUpperCase(lettersSecondString)){

                alteredSecondString += Character.toLowerCase(lettersSecondString);
            } else {

                alteredSecondString += lettersSecondString;
            }
        }

        combinedStrings = alteredFirstString + " " + alteredSecondString;

        System.out.println("Combined strings: " + combinedStrings);
    }
}