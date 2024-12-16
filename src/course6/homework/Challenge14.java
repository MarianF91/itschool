package course6.homework;

public class Challenge14 {

    public static void main(String[] args) {

        int number = 100;

        System.out.println("Original number: " + number);

        while (number > 80) {
            number-=1;
        }

        if (number == 80){
            System.out.println("Number after being decreased by 1 for 20 times: " + number);
            number *= 2;
            System.out.println("Number after being decreased by 1 for 20 times and then multiplied by 2: " + number);
        }
    }
}
