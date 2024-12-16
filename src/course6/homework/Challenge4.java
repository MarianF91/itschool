package course6.homework;

public class Challenge4 {

    public static void main(String[] args) {

        int firstHeight = 10;
        int secondHeight = 12;

        String maximumHeight = (firstHeight > secondHeight) ? ("firstHeight has the higher value, because " + (firstHeight + " > " + secondHeight))
        : ("secondHeight has the higher value, because " + (secondHeight + " > " + firstHeight));

        System.out.println(maximumHeight);
    }
}