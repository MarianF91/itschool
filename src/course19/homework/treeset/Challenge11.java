package course19.homework.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Challenge11 {
    public static void main(String[] args) {
        TreeSet<Double> numbers = new TreeSet<>();
        numbers.add(1.2);
        numbers.add(7.1);
        numbers.add(0.0);
        numbers.add(-1.9);
        numbers.add(-7.1);
        numbers.add(7.2);
        numbers.add(7.3);
        numbers.add(7.0);

        double comparisonValue = 7.0;

        Iterator<Double> numbersIterator = numbers.iterator();
        TreeSet<Double> equalOrLessThanSevenNumbers = new TreeSet<>();
        double equalOrLessThanSeven;

        while (numbersIterator.hasNext()){
            equalOrLessThanSeven = numbersIterator.next();
            if(equalOrLessThanSeven <= comparisonValue){
                equalOrLessThanSevenNumbers.add(equalOrLessThanSeven);
            }
        }

        System.out.println("TreeSet: " + numbers);
        System.out.println("Numbers that are equal or less than seven: " + equalOrLessThanSevenNumbers);
    }
}
