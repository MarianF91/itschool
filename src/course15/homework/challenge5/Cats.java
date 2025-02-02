package course15.homework.challenge5;

public class Cats extends Animal {
    @Override
    public void cats() {
        System.out.println("Cats meow!");
    }

    @Override
    public void dogs() {

    }

    //if the class isn't abstract it doesn't work, but if we make it abstract it won't work in main.
}