package course15.homework.challenge4;

public abstract class AbstractClass {

    public AbstractClass(){
        System.out.println("This is constructor of abstract class.");
    }

    public abstract void aMethod();

    public void anotherMethod() {

        System.out.println("This is a normal method of abstract class.");
    }
}
