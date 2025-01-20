package recap.java.basics;

public class Recap10 {

    String instanceScopeVariable = "instanceScopeVariable";
    static String staticScopeVariable = "staticScopeVariable";

    public static void main(String[] args) {

        System.out.println("This variable can be used only in static contexts, like here: " + staticScopeVariable);
        localScope();
        Recap10 instanceScopeVariable = new Recap10();
        System.out.println("This is an instance variable: " + instanceScopeVariable.instanceScopeVariable);
    }

    public static void localScope() {

        String localScopeVariable = "localScopeVariable";

        System.out.println("And also here: " + staticScopeVariable);
        System.out.println("Also, this is the local scope variable: " + localScopeVariable);

    }
}