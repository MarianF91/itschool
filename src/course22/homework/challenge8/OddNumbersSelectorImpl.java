package course22.homework.challenge8;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersSelectorImpl {
    public static void main(String[] args) {
        OddNumbersSelector selector = list ->{
            List<Integer> numbersList = new ArrayList<>();
            for (Integer number : list){
                if(number % 2 != 0){
                    numbersList.add(number);
                }
            }
            return numbersList;
        };

        List<Integer> newNumbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> oddNumbers = selector.oddNumbersFilter(newNumbers);
        System.out.println(oddNumbers);
    }
}
