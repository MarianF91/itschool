package course8.homework;

public class Challenge8 {

    public static void main(String[] args) {

        StringBuilder originalText = new StringBuilder("Ana are mere.");

        System.out.println("Original text: " + originalText);

        originalText.insert(3, " nu");

        System.out.println("Modified text: " + originalText);
    }
}