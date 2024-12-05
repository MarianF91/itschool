import org.w3c.dom.ls.LSOutput;

public class Tema2 {

    static int cifraPara = 0, cifraImpara = 1, numarPar= 10, numarImpar = 11;
    static double numarCuMulteZecimale = 1.23456789, numarNegativ = -1, numarNegativCuMulteZecimale = -1.23456789;
    static char literaMare = 'A', literaMica = 'a';
    static String propozitieOarecare = "Ana are mere.";

    public static void main(String[] args) {
        System.out.println("Variabile de tip INT: " + cifraPara + ", "+ cifraImpara + ", " + numarPar + ", " + numarImpar);
        System.out.println("Variabile de tip double: " + numarCuMulteZecimale + ", " + numarNegativ + ", " + numarNegativCuMulteZecimale);
        System.out.println("Variabile de tip char: " + literaMare + ", " + literaMica);
        System.out.println("Variabila de tip string: " + propozitieOarecare);
    }

}