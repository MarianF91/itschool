package course1.homework.ex1;

import java.util.Scanner;

public class T1V4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Care este numele tau de familie: ");
        String nume = scan.nextLine();

        System.out.println("Dar prenumele: ");
        String prenume = scan.nextLine();

        System.out.println("Cati ani ai? ");
        String varsta = scan.nextLine();

        System.out.println("Care este culoarea ta preferata?");
        String culoare = scan.nextLine();

        System.out.println("Ma bucur sa te cunosc, " + nume + " " + prenume + "! " + varsta + " este o varsta frumoasa," +
                " iar culoarea" + " " + culoare + " este si culoarea mea preferata.");
    }
}
