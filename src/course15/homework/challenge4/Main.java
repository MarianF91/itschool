package course15.homework.challenge4;

public class Main {

    public static void main(String[] args) {
        AbstractClass subclass = new SubClass();
        subclass.aMethod();
        subclass.anotherMethod();

        /* When we create an object using a subclass, the first call is to the superclass constructor and then the one
        of the subclass.
        Due to the fact that aMethod is overridden in SubClass, we get the message from SubClass, which is:
         "This is abstract method.".
         When we use anotherMethod(), inherited from from the superclass, we get the message "This is a normal method of
          abstract class."
         */
    }
}
