package course19.homework.linkedlist;

import java.util.LinkedList;

public class Challenge10 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("pink");
        colors.add("red");
        Integer firstOccurrence = null;
        Integer lastOccurence = null;
        String searchedElement = "red";

        for (int i = 0; i < colors.size(); i ++) {
            if (colors.get(i).equalsIgnoreCase(searchedElement)) {
                if (firstOccurrence == null){
                    firstOccurrence = i;
                }
                lastOccurence = i;
            }
        }
        System.out.println("First occurrence at index: " + firstOccurrence);
        System.out.println("Last occurrence at index: " + lastOccurence);
    }
}
