package course16.homework.challenge1.runtimepolymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {

        Parent parent;
        parent = new Subclass1();
        parent.print();

        parent = new Subclass2();
        parent.print();

        parent = new Parent();
        parent.print();
    }
}