package course9.homework;

public class BonusChallenge {

    public static void main(String[] args) {

        cineVreaMere();
    }

    public static void cineVreaMere() {

        StringBuilder originalFirstString = new StringBuilder("Ana are mere.");
        StringBuilder originalSecondString = new StringBuilder("Si Ionut are mere.");

        System.out.println("Original strings:\n" + originalFirstString+ "\n" + originalSecondString);

        StringBuilder alteredFirstString = originalFirstString.replace(originalFirstString.length() - 1,
                originalFirstString.length(), " si ");
        StringBuilder alteredSecondString = originalSecondString.delete(0,3);

        alteredFirstString.append(alteredSecondString);

        System.out.println("Combined strings: " + alteredFirstString);
    }
}