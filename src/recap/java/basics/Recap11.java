package recap.java.basics;

public class Recap11 {

    char character;
    String string;
    int fullNumber;
    double digitNumber;
    byte byteVar;
    float floatVar;
    long longVar;
    boolean booleanVar;

    public static void main(String[] args) {

        Recap11 defaultValues = new Recap11();

        System.out.println("This is the default value for:\n- char: " + defaultValues.character + "\n- string: " +
                defaultValues.string + "\n- int: " + defaultValues.fullNumber + "\n- double: " +
                defaultValues.digitNumber + "\n- byte: " + defaultValues.byteVar + "\n- float: " +
                defaultValues.floatVar + "\n- long: " + defaultValues.longVar + "\n- boolean: " + defaultValues.booleanVar);
    }
}