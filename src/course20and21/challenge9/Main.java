package course20and21.challenge9;

public class Main {
    public static void main(String[] args) {
        errorLog();
    }

    public static void errorLog() {
        ErrorLog test1 = new ErrorLog("Ahmed", 1);
        ErrorLog test2 = new ErrorLog("Jesus", 2);
        ErrorLog test3 = new ErrorLog("Vlăduț", 3);
        ErrorLog test4 = new ErrorLog("Moses", 4);
        ErrorLog test5 = new ErrorLog("Batman", 100);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
    }
}
