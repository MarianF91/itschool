package course19.homework.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Challenge9 {
    public static void main(String[] args) {
       TreeSet<Double> numbers = new TreeSet<>();
       numbers.add(1.2);
       numbers.add(7.1);
       numbers.add(0.0);
       numbers.add(-1.9);
       numbers.add(-7.1);
       numbers.add(7.2);
       numbers.add(7.3);

        Iterator<Double> numbersIterator = numbers.iterator();
        TreeSet<Double> higherThanSevenNumbers = new TreeSet<>();
        double higherThanSeven;

        while (numbersIterator.hasNext()){
            higherThanSeven = numbersIterator.next();
            if(higherThanSeven > 7){
                higherThanSevenNumbers.add(higherThanSeven);
            }
        }
        System.out.println("TreeSet: " + numbers);
        System.out.println("Numbers higher than seven: " + higherThanSevenNumbers);
    }
}
