package course6.homework;

public class Challenge1 {

    public static void main(String[] args) {

    String stringOne = new String ("OpenAI");
    String stringTwo = new String ("OpenAI");

    System.out.println("What do our comparison say?");

    System.out.println("equals says: " + stringOne.equals(stringTwo) + ", because equals verifies the content.");
    System.out.println("== says: " + (stringOne == stringTwo) + ", because == verifies the memory address.");
    }
}