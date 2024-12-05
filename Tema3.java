import javax.swing.*;
import java.util.Scanner;

public class Tema3 {


    public static void main(String[] args) {

        String adunare = "adunare";
        String scadere = "scadere";
        String inmultire = "inmultire)";
        String impartire = "impartire";
        String restulImpartirii = "impartire cu rest";

        System.out.println("Acest program poate face urmatoarele operatii matematice intre doua numere: ");
        System.out.println(" 1) adunare\n 2) scadere\n 3) inmultire\n 4) impartire\n 5) restul impartirii (impartire cu rest din care este afisat doar restul acesteia)");

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        double numar1 = scan.nextDouble();

        System.out.println("Introduceti al doilea numar: ");
        double numar2 = scan.nextDouble();

        System.out.println("Introduceti operatia dorita (ex. 1): ");

        scan.nextLine();

        String operatie = scan.nextLine();
        if (operatie.equals("1")) {
            System.out.println("Ati ales adunare.");
            System.out.println(numar1 + ("+") + numar2 + ("=") + (numar1 + numar2));
        } else if (operatie.equals("2")) {
            System.out.println("Ati ales scadere.");
            System.out.println(numar1 + ("-") + numar2 + ("=") + (numar1 - numar2));
        } else if (operatie.equals("3")) {
            System.out.println("Ati ales inmultire");
            System.out.println(numar1 + ("x") + numar2 + ("=") + (numar1 * numar2));
        } else if (operatie.equals("4") && numar2 != 0) {
            System.out.println("Ati ales impartire.");
            System.out.println(numar1 + ("/") + numar2 + ("=") + (numar1 / numar2));
        } else if (numar2 == 0) {
            System.out.println("Nu se poate imparti la 0.");
        } else if (operatie.equals("5") && numar2 != 0) {
            System.out.println("Ati ales restul impartirii.");
            System.out.println(numar1 + ("%") + numar2 + ("=") + (numar1 % numar2));
        } else if (numar2 == 0) {
            System.out.println("Nu se poate imparti la 0.");
        } else {
            System.out.println("Va rog sa alegeti o optiune valida.");
        }
    }
}