package course22.homework.challenge6;

public class SubstringSelectionImpl {
    public static void main(String[] args) {
        String exampleText = "Anna has apples.";

        SubstringSelection substringSelection = (string, letterCounter) -> {
            if (letterCounter >= string.length()){
                return string;
            } else {
                return string.substring(0,letterCounter);
            }
        };

        String result1 = substringSelection.selectSubstring(exampleText, 10);
        String result2 = substringSelection.selectSubstring(exampleText, 29);

        System.out.println(result1);
        System.out.println(result2);

    }
}