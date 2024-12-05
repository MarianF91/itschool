import java.util.Scanner;

public class TemaSuplimentara1Curs1Curs2 {

    static double adunare(double numar1, double numar2)
    {
        double addition = numar1 + numar2;

        return addition;

    }
    static double scadere(double numar1, double numar2)
    {
        double decrease = numar1 - numar2;

        return decrease;

    }
    static double inmultire(double numar1, double numar2)
    {
        double multiplication = numar1 * numar2;

        return multiplication;

    }

static double impartire(double numar1, double numar2) {
    if (numar2 != 0)
    {
        double division = numar1 / numar2;


        return division;
    }

    else
    {

        return Double.NaN;
    }
}

static double rest(double numar1, double numar2)
{
    if (numar2 != 0)
    {
        double restImpartire = numar1 % numar2;


        return restImpartire;
    }
    else
    {
        System.out.println("Nu se poate imparti la 0.");
        return Double.NaN;
    }
}

    public static void main(String[] args) {

    Scanner numarIntrare = new Scanner (System.in);
    System.out.println("Introduceti primul numar:");
    double numar1 = numarIntrare.nextDouble();
    System.out.println("Introduceti al doilea numar:");
    double numar2 = numarIntrare.nextDouble();

    double rezultatAdunare = adunare(numar1,numar2);
    double rezultatScadere = scadere(numar1,numar2);
    double rezultatInmultire = inmultire(numar1,numar2);
    double rezultatImpartire = impartire(numar1,numar2);
    double rezultatRest = rest(numar1,numar2);




    System.out.println("Rezultatul adunarii este: " + rezultatAdunare);
    System.out.println("Rezultatul scaderii este: " + rezultatScadere);
    System.out.println("Rezultatul inmultirii este: " + rezultatInmultire);
    System.out.println("Rezultatul impartirii este: " + rezultatImpartire);
    System.out.println("Restul impartirii este: " + rezultatRest);

    }
}