package course15.homework.challenge5;

public class Main {

    public static void main(String[] args) {

        Cats cats = new Cats();
        cats.cats();

        Dogs dogs = new Dogs();
        dogs.dogs();

        /*if Cats isn't abstract it doesn't work, but if we make it abstract it won't work in main. The same goes for Dogs.
        The only solution is to implement both methods and leave one of them the way it is and not to override on it.*/
    }
}