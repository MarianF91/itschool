package course22.homework;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("word1", "word7", "word5", "words");
        System.out.println("Original words list: " + words);

        words.sort((w1, w2) -> w1.compareTo(w2));

        System.out.println("Alphabetical order: " + words);

        words.sort((w1, w2) -> w2.compareTo(w1));

        System.out.println("Reversed alphabetical order: " + words);
    }
}
